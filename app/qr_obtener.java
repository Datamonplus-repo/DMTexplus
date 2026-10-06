package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class qr_obtener extends GXProcedure
{
   public qr_obtener( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( qr_obtener.class ), "" );
   }

   public qr_obtener( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             short aP1 ,
                             short aP2 )
   {
      qr_obtener.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        short aP1 ,
                        short aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             short aP1 ,
                             short aP2 ,
                             String[] aP3 )
   {
      qr_obtener.this.AV13Data = aP0;
      qr_obtener.this.AV16Height = aP1;
      qr_obtener.this.AV17Width = aP2;
      qr_obtener.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18pHeight = (short)(((0==AV16Height) ? 300 : AV16Height)) ;
      AV19pWidth = (short)(((0==AV17Width) ? 300 : AV17Width)) ;
      AV11Base64 = AV14QRCode.qrcode(AV19pWidth, AV18pHeight, AV13Data) ;
      if ( GXutil.len( AV11Base64) > 100 )
      {
         AV12Blob=GXutil.blobFromBase64( AV11Base64) ;
         AV15Url = AV12Blob ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = qr_obtener.this.AV15Url;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15Url = "" ;
      AV11Base64 = "" ;
      AV14QRCode = new app.SdtAppTool(remoteHandle, context);
      AV12Blob = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV16Height ;
   private short AV17Width ;
   private short AV18pHeight ;
   private short AV19pWidth ;
   private short Gx_err ;
   private String AV13Data ;
   private String AV11Base64 ;
   private String AV12Blob ;
   private String AV15Url ;
   private app.SdtAppTool AV14QRCode ;
   private String[] aP3 ;
}

