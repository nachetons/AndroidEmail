package com.tema6.tema6ejemplo2.Adapters;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.tema6.tema6ejemplo2.Models.Mail;
import com.tema6.tema6ejemplo2.R;

import java.util.List;

public class MailAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Mail> list;
    private int SUBJECT_MAX_LENGHT = 40;
    private int MESSAGE_MAX_LENGHT = 80;

    public MailAdapter(Context context, int layout, List<Mail> list) {
        this.context = context;
        this.layout = layout;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Mail getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }


    //Cogemos nuestras variables declaradas arriba y las referenciamos con las del xml para inflarlo
    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(layout, null);
            holder = new ViewHolder();
            holder.subject = (TextView) convertView.findViewById(R.id.textViewListSubject);
            holder.message = (TextView) convertView.findViewById(R.id.textViewListMessage);
            holder.sender = (TextView) convertView.findViewById(R.id.textViewListSenderName);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }


        Mail currentMail = getItem(position);

        // Si el titulo del correo es mas corto de 40 letras, lo dejamos igual, si es mas largo,
        // lo cortamos y le aÃ±adimos puntos suspensivos al final
        String shortSubject;
        if (currentMail.getSubject().length() > SUBJECT_MAX_LENGHT) {
            shortSubject = currentMail.getSubject().substring(0, SUBJECT_MAX_LENGHT) + "...";
        } else {
            shortSubject = currentMail.getSubject();
        }
        holder.subject.setText(shortSubject);


        // Si el mensaje de correo es mÃ¡s corto de 80 letras, lo dejamos igual, si es mÃ¡s largo,
        // lo cortamos y le aÃ±adimos puntos suspensivos al final
        String shortMessage;
        if (currentMail.getMessage().length() > MESSAGE_MAX_LENGHT) {
            shortMessage = currentMail.getMessage().substring(0, MESSAGE_MAX_LENGHT) + "...";
        } else {
            shortMessage = currentMail.getMessage();
        }
        holder.message.setText(shortMessage);

        // Cogemos la segunda letra del correo porque le puse a los correos <> para que quede mas estetico
        holder.sender.setText(currentMail.getSenderName().substring(1, 2));
        // Obtenemos el backround que es un drawable, y le cambiamos el color con el random color
        holder.sender.getBackground().setColorFilter(Color.parseColor("#" + currentMail.getColor()), PorterDuff.Mode.SRC);

        return convertView;
    }

    static class ViewHolder {
        private TextView subject;
        private TextView message;
        private TextView sender;
    }
}