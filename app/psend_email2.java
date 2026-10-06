package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psend_email2 extends GXProcedure
{
   public psend_email2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psend_email2.class ), "" );
   }

   public psend_email2( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( app.SdtEmails aP0 ,
                             GXBaseCollection<app.SdtFileUploadFiles_File> aP1 ,
                             long[] aP2 )
   {
      psend_email2.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( app.SdtEmails aP0 ,
                        GXBaseCollection<app.SdtFileUploadFiles_File> aP1 ,
                        long[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( app.SdtEmails aP0 ,
                             GXBaseCollection<app.SdtFileUploadFiles_File> aP1 ,
                             long[] aP2 ,
                             String[] aP3 )
   {
      psend_email2.this.AV52Emails = aP0;
      psend_email2.this.AV47FileUploadFiles = aP1;
      psend_email2.this.aP2 = aP2;
      psend_email2.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV25EmprCod ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerempresa(remoteHandle, context).execute( GXv_char2) ;
      psend_email2.this.GXt_char1 = GXv_char2[0] ;
      AV25EmprCod = GXt_char1 ;
      GXt_char1 = AV27Host ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV25EmprCod, "MAISVR", GXv_char2) ;
      psend_email2.this.GXt_char1 = GXv_char2[0] ;
      AV27Host = GXt_char1 ;
      GXt_int3 = AV28HostPort ;
      GXv_int4[0] = GXt_int3 ;
      new app.pbuscon(remoteHandle, context).execute( AV25EmprCod, "MAISVR", GXv_int4) ;
      psend_email2.this.GXt_int3 = GXv_int4[0] ;
      AV28HostPort = GXt_int3 ;
      AV28HostPort = ((0==AV28HostPort) ? 465 : AV28HostPort) ;
      GXt_char1 = AV37Remitente ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV25EmprCod, "MAIDE", GXv_char2) ;
      psend_email2.this.GXt_char1 = GXv_char2[0] ;
      AV37Remitente = GXt_char1 ;
      GXt_char1 = AV38Remitentemail ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV25EmprCod, "MAIDEM", GXv_char2) ;
      psend_email2.this.GXt_char1 = GXv_char2[0] ;
      AV38Remitentemail = GXt_char1 ;
      GXt_int3 = AV30MailLogin ;
      GXv_char2[0] = AV25EmprCod ;
      GXv_char5[0] = "MAIUSR" ;
      GXv_int4[0] = GXt_int3 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char2, GXv_char5, GXv_int4) ;
      psend_email2.this.AV25EmprCod = GXv_char2[0] ;
      psend_email2.this.GXt_int3 = GXv_int4[0] ;
      AV30MailLogin = (byte)(GXt_int3) ;
      GXt_char1 = AV31MailType ;
      GXv_char5[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV25EmprCod, "MAITYP", GXv_char5) ;
      psend_email2.this.GXt_char1 = GXv_char5[0] ;
      AV31MailType = GXt_char1 ;
      GXt_char1 = AV60PATHPDF ;
      GXv_char5[0] = GXt_char1 ;
      new app.pbusemplin(remoteHandle, context).execute( AV25EmprCod, httpContext.getMessage( "WEBPDF", ""), GXv_char5) ;
      psend_email2.this.GXt_char1 = GXv_char5[0] ;
      AV60PATHPDF = GXt_char1 ;
      /* User Code */
       try {
      if ( AV47FileUploadFiles.size() > 0 )
      {
         AV64GXV1 = 1 ;
         while ( AV64GXV1 <= AV47FileUploadFiles.size() )
         {
            AV48FileUploadFile = (app.SdtFileUploadFiles_File)((app.SdtFileUploadFiles_File)AV47FileUploadFiles.elementAt(-1+AV64GXV1));
            AV56EmailAttached = (app.SdtEmails_AttachedItem)new app.SdtEmails_AttachedItem(remoteHandle, context);
            if ( (GXutil.strcmp("", AV48FileUploadFile.getgxTv_SdtFileUploadFiles_File_Path())==0) )
            {
               AV58Base64 = GXutil.blobToBase64( AV48FileUploadFile.getgxTv_SdtFileUploadFiles_File_File()) ;
               AV65Path = AV60PATHPDF + AV48FileUploadFile.getgxTv_SdtFileUploadFiles_File_Fullname() ;
               GXt_char1 = "" ;
               GXv_char5[0] = GXt_char1 ;
               new app.getpathfortypefile(remoteHandle, context).execute( AV58Base64, AV65Path, GXv_char5) ;
               psend_email2.this.GXt_char1 = GXv_char5[0] ;
               AV56EmailAttached.setgxTv_SdtEmails_AttachedItem_Path( GXt_char1 );
            }
            else
            {
               AV56EmailAttached.setgxTv_SdtEmails_AttachedItem_Path( AV48FileUploadFile.getgxTv_SdtFileUploadFiles_File_Path() );
            }
            AV52Emails.getgxTv_SdtEmails_Attached().add(AV56EmailAttached, 0);
            AV64GXV1 = (int)(AV64GXV1+1) ;
         }
      }
      /* User Code */
       } catch (Exception e) {
      /* User Code */
       System.out.println("psend_email -> Correo Attached file ");
      /* User Code */
       System.out.println(e.getMessage());
      /* User Code */
       }
      AV54strEmails = AV52Emails.toJSonString(false, true) ;
      AV55Return = AV53AppTools.email(AV54strEmails) ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).write(AV55Return, httpContext.getMessage( "Return gear email", ""), (short)(10)) ;
      if ( GxRegex.IsMatch(AV55Return,httpContext.getMessage( "error", "")) )
      {
         AV16CodigoErrorEnvio = 99999 ;
         AV21DescripcionErrorEnvio = AV55Return ;
      }
      else
      {
         AV16CodigoErrorEnvio = 200 ;
         AV21DescripcionErrorEnvio = "Mail enviado ... " ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = psend_email2.this.AV16CodigoErrorEnvio;
      this.aP3[0] = psend_email2.this.AV21DescripcionErrorEnvio;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV21DescripcionErrorEnvio = "" ;
      AV25EmprCod = "" ;
      AV27Host = "" ;
      AV37Remitente = "" ;
      AV38Remitentemail = "" ;
      GXv_char2 = new String[1] ;
      GXv_int4 = new int[1] ;
      AV31MailType = "" ;
      AV60PATHPDF = "" ;
      AV48FileUploadFile = new app.SdtFileUploadFiles_File(remoteHandle, context);
      AV56EmailAttached = new app.SdtEmails_AttachedItem(remoteHandle, context);
      AV58Base64 = "" ;
      AV65Path = "" ;
      GXt_char1 = "" ;
      GXv_char5 = new String[1] ;
      AV54strEmails = "" ;
      AV55Return = "" ;
      AV53AppTools = new app.SdtAppTool(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV30MailLogin ;
   private short Gx_err ;
   private int AV28HostPort ;
   private int GXt_int3 ;
   private int GXv_int4[] ;
   private int AV64GXV1 ;
   private long AV16CodigoErrorEnvio ;
   private String AV25EmprCod ;
   private String AV27Host ;
   private String AV37Remitente ;
   private String AV38Remitentemail ;
   private String GXv_char2[] ;
   private String AV31MailType ;
   private String GXt_char1 ;
   private String GXv_char5[] ;
   private String AV58Base64 ;
   private String AV54strEmails ;
   private String AV55Return ;
   private String AV21DescripcionErrorEnvio ;
   private String AV60PATHPDF ;
   private String AV65Path ;
   private app.SdtAppTool AV53AppTools ;
   private String[] aP3 ;
   private long[] aP2 ;
   private GXBaseCollection<app.SdtFileUploadFiles_File> AV47FileUploadFiles ;
   private app.SdtFileUploadFiles_File AV48FileUploadFile ;
   private app.SdtEmails AV52Emails ;
   private app.SdtEmails_AttachedItem AV56EmailAttached ;
}

