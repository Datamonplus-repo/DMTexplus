package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pccpolfchstr extends GXProcedure
{
   public pccpolfchstr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pccpolfchstr.class ), "" );
   }

   public pccpolfchstr( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( java.util.Date aP0 ,
                             byte aP1 )
   {
      pccpolfchstr.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( java.util.Date aP0 ,
                        byte aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( java.util.Date aP0 ,
                             byte aP1 ,
                             String[] aP2 )
   {
      pccpolfchstr.this.AV8Fch = aP0;
      pccpolfchstr.this.AV9Frm = aP1;
      pccpolfchstr.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10Str = "" ;
      if ( AV9Frm == 0 )
      {
         AV10Str = GXutil.padl( GXutil.trim( GXutil.str( GXutil.day( AV8Fch), 10, 0)), (short)(2), "0") + "/" + GXutil.padl( GXutil.trim( GXutil.str( GXutil.month( AV8Fch), 10, 0)), (short)(2), "0") + "/" + GXutil.substring( GXutil.trim( GXutil.str( GXutil.year( AV8Fch), 10, 0)), 3, 2) ;
      }
      else if ( AV9Frm == 1 )
      {
         AV10Str = GXutil.padl( GXutil.trim( GXutil.str( GXutil.day( AV8Fch), 10, 0)), (short)(2), "0") + "." + GXutil.padl( GXutil.trim( GXutil.str( GXutil.month( AV8Fch), 10, 0)), (short)(2), "0") + "." + GXutil.substring( GXutil.trim( GXutil.str( GXutil.year( AV8Fch), 10, 0)), 3, 2) ;
      }
      else if ( AV9Frm == 2 )
      {
         AV10Str = GXutil.padl( GXutil.trim( GXutil.str( GXutil.day( AV8Fch), 10, 0)), (short)(2), "0") + "-" + GXutil.padl( GXutil.trim( GXutil.str( GXutil.month( AV8Fch), 10, 0)), (short)(2), "0") + "-" + GXutil.substring( GXutil.trim( GXutil.str( GXutil.year( AV8Fch), 10, 0)), 3, 2) ;
      }
      else if ( AV9Frm == 3 )
      {
         AV10Str = GXutil.padl( GXutil.trim( GXutil.str( GXutil.day( AV8Fch), 10, 0)), (short)(2), "0") + "/" + GXutil.padl( GXutil.trim( GXutil.str( GXutil.month( AV8Fch), 10, 0)), (short)(2), "0") + "/" + GXutil.trim( GXutil.str( GXutil.year( AV8Fch), 10, 0)) ;
      }
      else if ( AV9Frm == 4 )
      {
         AV10Str = GXutil.padl( GXutil.trim( GXutil.str( GXutil.day( AV8Fch), 10, 0)), (short)(2), "0") + "." + GXutil.padl( GXutil.trim( GXutil.str( GXutil.month( AV8Fch), 10, 0)), (short)(2), "0") + "." + GXutil.trim( GXutil.str( GXutil.year( AV8Fch), 10, 0)) ;
      }
      else if ( AV9Frm == 5 )
      {
         AV10Str = GXutil.padl( GXutil.trim( GXutil.str( GXutil.day( AV8Fch), 10, 0)), (short)(2), "0") + "-" + GXutil.padl( GXutil.trim( GXutil.str( GXutil.month( AV8Fch), 10, 0)), (short)(2), "0") + "-" + GXutil.trim( GXutil.str( GXutil.year( AV8Fch), 10, 0)) ;
      }
      else if ( AV9Frm == 6 )
      {
         AV10Str = GXutil.padl( GXutil.trim( GXutil.str( GXutil.day( AV8Fch), 10, 0)), (short)(2), "0") + httpContext.getMessage( " de ", "") + GXutil.trim( localUtil.cmonth( AV8Fch, httpContext.getLanguage( ))) + httpContext.getMessage( " de ", "") + GXutil.trim( GXutil.str( GXutil.year( AV8Fch), 10, 0)) ;
      }
      else if ( AV9Frm == 7 )
      {
         AV10Str = GXutil.padl( GXutil.trim( GXutil.str( GXutil.day( AV8Fch), 10, 0)), (short)(2), "0") + httpContext.getMessage( " de ", "") + GXutil.trim( localUtil.cmonth( AV8Fch, httpContext.getLanguage( ))) ;
      }
      else if ( AV9Frm == 8 )
      {
         AV10Str = GXutil.trim( localUtil.cdow( AV8Fch, httpContext.getLanguage( ))) + ", " + GXutil.padl( GXutil.trim( GXutil.str( GXutil.day( AV8Fch), 10, 0)), (short)(2), "0") + httpContext.getMessage( " de ", "") + GXutil.trim( localUtil.cmonth( AV8Fch, httpContext.getLanguage( ))) + httpContext.getMessage( " de ", "") + GXutil.trim( GXutil.str( GXutil.year( AV8Fch), 10, 0)) ;
      }
      else if ( AV9Frm == 9 )
      {
         AV10Str = GXutil.trim( localUtil.cdow( AV8Fch, httpContext.getLanguage( ))) + ", " + GXutil.padl( GXutil.trim( GXutil.str( GXutil.day( AV8Fch), 10, 0)), (short)(2), "0") + httpContext.getMessage( " de ", "") + GXutil.trim( localUtil.cmonth( AV8Fch, httpContext.getLanguage( ))) ;
      }
      else
      {
         AV10Str += httpContext.getMessage( "!!! Formato de fecha inválido, Formato : ", "") + GXutil.trim( GXutil.str( AV9Frm, 10, 0)) + httpContext.getMessage( ", Valor : ", "") + localUtil.dtoc( AV8Fch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " ¡¡¡" ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = pccpolfchstr.this.AV10Str;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Str = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9Frm ;
   private short Gx_err ;
   private java.util.Date AV8Fch ;
   private String AV10Str ;
   private String[] aP2 ;
}

