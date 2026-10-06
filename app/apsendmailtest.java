package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apsendmailtest extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apsendmailtest pgm = new apsendmailtest (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apsendmailtest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apsendmailtest.class ), "" );
   }

   public apsendmailtest( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV36SMTPSession.setHost( httpContext.getMessage( "smtpa.netcabo.pt", "") );
      AV36SMTPSession.setPort( 25 );
      AV36SMTPSession.setAuthentication( (short)(1) );
      AV36SMTPSession.setUserName( httpContext.getMessage( "rui_pedro_31@netcabo.pt", "") );
      AV36SMTPSession.setPassword( httpContext.getMessage( "mafalda", "") );
      AV36SMTPSession.getSender().setAddress( httpContext.getMessage( "rui_pedro_31@netcabo.pt", "") );
      AV36SMTPSession.getSender().setName( httpContext.getMessage( "Carvema", "") );
      AV37MailRecipient.setAddress( httpContext.getMessage( "jleon@datamonplus.com", "") );
      AV37MailRecipient.setName( httpContext.getMessage( "Juan.Datamon", "") );
      AV38MailMessage.getTo().add(AV37MailRecipient);
      AV57I = 1 ;
      while ( GXutil.strcmp(AV47Adjuntos[(int)(AV57I)-1], "") != 0 )
      {
         AV38MailMessage.getAttachments().add(AV47Adjuntos[(int)(AV57I)-1]);
         AV57I = (long)(AV57I+1) ;
      }
      AV37MailRecipient.setAddress( httpContext.getMessage( "ruipedro@carvema.pt", "") );
      AV37MailRecipient.setName( httpContext.getMessage( "Rui", "") );
      AV38MailMessage.getCc().add(AV37MailRecipient);
      AV38MailMessage.setSubject( httpContext.getMessage( "Pruebas Envio Mail", "") );
      AV38MailMessage.setText( httpContext.getMessage( "Hola", "") );
      AV38MailMessage.getTo().add(AV37MailRecipient);
      AV36SMTPSession.login();
      if ( AV36SMTPSession.getErrCode() > 0 )
      {
         Gx_msg = httpContext.getMessage( "Error al conectar al SMTP (&SMTPSession.Login())", "") + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "Error= ", "") + GXutil.str( AV36SMTPSession.getErrCode(), 4, 0) + " " + AV36SMTPSession.getErrDescription() + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "Consultar con Soporte Aplicacion.", "") + GXutil.chr( (short)(13)) ;
         httpContext.GX_msglist.addItem(Gx_msg);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      else
      {
         AV36SMTPSession.send(AV38MailMessage);
         if ( AV36SMTPSession.getErrCode() > 0 )
         {
            Gx_msg = httpContext.getMessage( "Error al conectar al Enviar (&SMTPSession.Send(&MailMessage) )", "") + GXutil.chr( (short)(13)) ;
            Gx_msg += httpContext.getMessage( "Error= ", "") + GXutil.str( AV36SMTPSession.getErrCode(), 4, 0) + " " + AV36SMTPSession.getErrDescription() + GXutil.chr( (short)(13)) ;
            Gx_msg += httpContext.getMessage( "Consultar con Soporte Aplicacion.", "") + GXutil.chr( (short)(13)) ;
            httpContext.GX_msglist.addItem(Gx_msg);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV36SMTPSession.logout();
      }
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(psendmailtest.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV36SMTPSession = new com.genexus.internet.GXSMTPSession();
      AV37MailRecipient = new com.genexus.internet.MailRecipient();
      AV38MailMessage = new com.genexus.internet.GXMailMessage();
      AV47Adjuntos = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV47Adjuntos[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      Gx_msg = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int GX_I ;
   private long AV57I ;
   private String Gx_msg ;
   private boolean returnInSub ;
   private String AV47Adjuntos[] ;
   private com.genexus.internet.MailRecipient AV37MailRecipient ;
   private com.genexus.internet.GXSMTPSession AV36SMTPSession ;
   private com.genexus.internet.GXMailMessage AV38MailMessage ;
}

