package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfectin extends GXProcedure
{
   public pfectin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfectin.class ), "" );
   }

   public pfectin( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     java.util.Date[] aP1 )
   {
      pfectin.this.aP2 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        java.util.Date[] aP1 ,
                        java.util.Date[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             java.util.Date[] aP1 ,
                             java.util.Date[] aP2 )
   {
      pfectin.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfectin.this.AV8UltFec = aP1[0];
      this.aP1 = aP1;
      pfectin.this.AV9ProFec = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9ProFec = GXutil.dadd(AV8UltFec,-(1)) ;
      AV12Horas = (byte)(1) ;
      AV15FlagCal = (byte)(1) ;
      while ( ( AV12Horas != 0 ) && ( AV15FlagCal == 1 ) )
      {
         AV14Dia = (byte)(GXutil.day( AV9ProFec)) ;
         AV11Mes = (byte)(GXutil.month( AV9ProFec)) ;
         AV10Any = (short)(GXutil.year( AV9ProFec)) ;
         AV15FlagCal = (byte)(0) ;
         AV12Horas = (byte)(0) ;
         /* Using cursor P012F2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(AV10Any), Byte.valueOf(AV11Mes)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A614MaqMes = P012F2_A614MaqMes[0] ;
            A599MaqAny = P012F2_A599MaqAny[0] ;
            A602MaqCod = P012F2_A602MaqCod[0] ;
            A610MaqHNPMes = P012F2_A610MaqHNPMes[0] ;
            n610MaqHNPMes = P012F2_n610MaqHNPMes[0] ;
            if ( GXutil.strcmp(A602MaqCod, httpContext.getMessage( "TI    ", "")) == 0 )
            {
               AV15FlagCal = (byte)(1) ;
               AV13Inicio = (byte)((AV14Dia*2)) ;
               AV18HorCar = GXutil.substring( A610MaqHNPMes, AV13Inicio, 2) ;
               AV12Horas = (byte)(GXutil.lval( AV18HorCar)) ;
               if ( AV12Horas != 0 )
               {
                  AV9ProFec = GXutil.dadd(AV9ProFec,-(1)) ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
      }
      if ( AV15FlagCal == 0 )
      {
         AV16Mensa = localUtil.dtoc( AV9ProFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         AV17Mens = httpContext.getMessage( "No hay entrada de calendario para la fecha ", "") + AV16Mensa ;
         httpContext.GX_msglist.addItem(AV17Mens);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfectin.this.A396EmprCod;
      this.aP1[0] = pfectin.this.AV8UltFec;
      this.aP2[0] = pfectin.this.AV9ProFec;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P012F2_A396EmprCod = new String[] {""} ;
      P012F2_A614MaqMes = new byte[1] ;
      P012F2_A599MaqAny = new short[1] ;
      P012F2_A602MaqCod = new String[] {""} ;
      P012F2_A610MaqHNPMes = new String[] {""} ;
      P012F2_n610MaqHNPMes = new boolean[] {false} ;
      A602MaqCod = "" ;
      A610MaqHNPMes = "" ;
      AV18HorCar = "" ;
      AV16Mensa = "" ;
      AV17Mens = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfectin__default(),
         new Object[] {
             new Object[] {
            P012F2_A396EmprCod, P012F2_A614MaqMes, P012F2_A599MaqAny, P012F2_A602MaqCod, P012F2_A610MaqHNPMes, P012F2_n610MaqHNPMes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12Horas ;
   private byte AV15FlagCal ;
   private byte AV14Dia ;
   private byte AV11Mes ;
   private byte A614MaqMes ;
   private byte AV13Inicio ;
   private short AV10Any ;
   private short A599MaqAny ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String AV18HorCar ;
   private String AV16Mensa ;
   private String AV17Mens ;
   private java.util.Date AV8UltFec ;
   private java.util.Date AV9ProFec ;
   private boolean n610MaqHNPMes ;
   private String A610MaqHNPMes ;
   private java.util.Date[] aP2 ;
   private String[] aP0 ;
   private java.util.Date[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P012F2_A396EmprCod ;
   private byte[] P012F2_A614MaqMes ;
   private short[] P012F2_A599MaqAny ;
   private String[] P012F2_A602MaqCod ;
   private String[] P012F2_A610MaqHNPMes ;
   private boolean[] P012F2_n610MaqHNPMes ;
}

final  class pfectin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P012F2", "SELECT EmprCod, MaqMes, MaqAny, MaqCod, MaqHNPMes FROM TXPMAQHNP WHERE (EmprCod = ?) AND (MaqAny = ?) AND (MaqMes = ?) ORDER BY EmprCod, MaqCod, MaqAny, MaqMes ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
      }
   }

}

