package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plic2par extends GXProcedure
{
   public plic2par( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plic2par.class ), "" );
   }

   public plic2par( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] AV8Parm )
   {
      plic2par.this.aP1 = new String[] {""};
      execute_int(AV8Parm, aP1);
      return aP1[0];
   }

   public void execute( String[] AV8Parm ,
                        String[] aP1 )
   {
      execute_int(AV8Parm, aP1);
   }

   private void execute_int( String[] AV8Parm ,
                             String[] aP1 )
   {
      plic2par.this.AV8Parm = AV8Parm;
      plic2par.this.AV13Cadena1 = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10cnt = DecimalUtil.doubleToDec(1) ;
      while ( AV10cnt.doubleValue() <= 20 )
      {
         AV8Parm[(int)(DecimalUtil.decToDouble(AV10cnt))-1] = "" ;
         AV10cnt = AV10cnt.add(DecimalUtil.doubleToDec(1)) ;
      }
      GXt_char1 = AV9Cadena ;
      GXv_char2[0] = AV13Cadena1 ;
      GXv_char3[0] = httpContext.getMessage( "SERGIOSCHAAF", "") ;
      GXv_char4[0] = GXt_char1 ;
      new app.plicdcrp(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4) ;
      plic2par.this.AV13Cadena1 = GXv_char2[0] ;
      plic2par.this.GXt_char1 = GXv_char4[0] ;
      AV9Cadena = GXt_char1 ;
      AV10cnt = DecimalUtil.doubleToDec(1) ;
      AV12cntpr = (byte)(1) ;
      while ( AV10cnt.doubleValue() <= GXutil.len( GXutil.trim( AV9Cadena)) )
      {
         AV11Letra = GXutil.substring( AV9Cadena, (int)(DecimalUtil.decToDouble(AV10cnt)), 1) ;
         if ( GXutil.strcmp(AV11Letra, "|") != 0 )
         {
            AV8Parm[AV12cntpr-1] += AV11Letra ;
         }
         else
         {
            AV12cntpr = (byte)(AV12cntpr+1) ;
         }
         AV10cnt = AV10cnt.add(DecimalUtil.doubleToDec(1)) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = plic2par.this.AV13Cadena1;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10cnt = DecimalUtil.ZERO ;
      AV9Cadena = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      AV11Letra = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12cntpr ;
   private short Gx_err ;
   private java.math.BigDecimal AV10cnt ;
   private String AV8Parm[] ;
   private String AV13Cadena1 ;
   private String AV9Cadena ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String AV11Letra ;
   private String[] aP1 ;
}

