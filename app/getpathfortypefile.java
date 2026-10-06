package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class getpathfortypefile extends GXProcedure
{
   public getpathfortypefile( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( getpathfortypefile.class ), "" );
   }

   public getpathfortypefile( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 )
   {
      getpathfortypefile.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String[] aP2 )
   {
      getpathfortypefile.this.AV11Base64 = aP0;
      getpathfortypefile.this.AV8path = aP1;
      getpathfortypefile.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12OutPath = AV14AppTool.base64tofile(AV11Base64, AV8path) ;
      AV12OutPath = AV8path ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = getpathfortypefile.this.AV12OutPath;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12OutPath = "" ;
      AV14AppTool = new app.SdtAppTool(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV11Base64 ;
   private String AV8path ;
   private String AV12OutPath ;
   private app.SdtAppTool AV14AppTool ;
   private String[] aP2 ;
}

