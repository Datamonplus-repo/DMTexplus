package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pccpolstrcase extends GXProcedure
{
   public pccpolstrcase( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pccpolstrcase.class ), "" );
   }

   public pccpolstrcase( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             byte aP1 )
   {
      pccpolstrcase.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        byte aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             byte aP1 ,
                             String[] aP2 )
   {
      pccpolstrcase.this.AV8Ent = aP0;
      pccpolstrcase.this.AV9Frm = aP1;
      pccpolstrcase.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( AV9Frm == 1 )
      {
         AV10Sal = GXutil.trim( GXutil.lower( AV8Ent)) ;
      }
      else if ( AV9Frm == 2 )
      {
         AV11LenTxt = (short)(GXutil.len( AV8Ent)-1) ;
         AV10Sal = GXutil.upper( GXutil.substring( AV8Ent, 1, 1)) + GXutil.substring( GXutil.lower( AV8Ent), 2, AV11LenTxt) ;
      }
      else if ( AV9Frm == 3 )
      {
         AV10Sal = GXutil.trim( GXutil.upper( AV8Ent)) ;
      }
      else
      {
         AV10Sal = httpContext.getMessage( "!!! Formato de case inválido, Case : ", "") + GXutil.trim( GXutil.str( AV9Frm, 10, 0)) + httpContext.getMessage( ", Valor : ", "") + GXutil.trim( AV8Ent) + "¡¡¡" ;
      }
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Sal:%1", ""), AV10Sal, "", "", "", "", "", "", "", ""), AV14Pgmname) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = pccpolstrcase.this.AV10Sal;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Sal = "" ;
      AV14Pgmname = "" ;
      AV14Pgmname = "ControlCalidadHTD.PCCPolStrCase" ;
      /* GeneXus formulas. */
      AV14Pgmname = "ControlCalidadHTD.PCCPolStrCase" ;
      Gx_err = (short)(0) ;
   }

   private byte AV9Frm ;
   private short AV11LenTxt ;
   private short Gx_err ;
   private String AV8Ent ;
   private String AV10Sal ;
   private String AV14Pgmname ;
   private String[] aP2 ;
}

