package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdiaslab extends GXProcedure
{
   public pdiaslab( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdiaslab.class ), "" );
   }

   public pdiaslab( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            java.util.Date[] aP1 ,
                            java.util.Date[] aP2 )
   {
      pdiaslab.this.aP3 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        java.util.Date[] aP1 ,
                        java.util.Date[] aP2 ,
                        short[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             java.util.Date[] aP1 ,
                             java.util.Date[] aP2 ,
                             short[] aP3 )
   {
      pdiaslab.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdiaslab.this.AV28PFecha = aP1[0];
      this.aP1 = aP1;
      pdiaslab.this.AV29UFecha = aP2[0];
      this.aP2 = aP2;
      pdiaslab.this.AV27TotDias = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12Horas = (byte)(1) ;
      AV27TotDias = (short)(0) ;
      AV35Dia = (byte)(GXutil.day( AV28PFecha)) ;
      AV34Mes = (byte)(GXutil.month( AV28PFecha)) ;
      AV10Any = (short)(GXutil.year( AV28PFecha)) ;
      AV14PDia = (byte)(GXutil.day( AV28PFecha)) ;
      AV11PMes = (byte)(GXutil.month( AV28PFecha)) ;
      AV30PAny = (short)(GXutil.year( AV28PFecha)) ;
      AV32UDia = (byte)(GXutil.day( AV29UFecha)) ;
      AV33UMes = (byte)(GXutil.month( AV29UFecha)) ;
      AV31UAny = (short)(GXutil.year( AV29UFecha)) ;
      AV23Puntero = AV35Dia ;
      while ( AV10Any <= AV31UAny )
      {
         while ( ( ( AV34Mes <= AV33UMes ) && ( AV10Any == AV31UAny ) ) || ( ( AV34Mes <= 12 ) && ( AV10Any != AV31UAny ) ) )
         {
            /* Execute user subroutine: 'CALCULO' */
            S111 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV34Mes = (byte)(AV34Mes+1) ;
            if ( AV34Mes == 13 )
            {
               if (true) break;
            }
         }
         if ( AV34Mes == 13 )
         {
            AV34Mes = (byte)(1) ;
         }
         AV10Any = (short)(AV10Any+1) ;
      }
      if ( ! (0==AV27TotDias) )
      {
         AV27TotDias = (short)(AV27TotDias-1) ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CALCULO' Routine */
      returnInSub = false ;
      /* Using cursor P021J2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(AV10Any), Byte.valueOf(AV34Mes)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A614MaqMes = P021J2_A614MaqMes[0] ;
         A599MaqAny = P021J2_A599MaqAny[0] ;
         A602MaqCod = P021J2_A602MaqCod[0] ;
         A610MaqHNPMes = P021J2_A610MaqHNPMes[0] ;
         n610MaqHNPMes = P021J2_n610MaqHNPMes[0] ;
         if ( GXutil.strcmp(A602MaqCod, httpContext.getMessage( "LB", "")) == 0 )
         {
            AV25Actual = localUtil.ymdtod( A599MaqAny, A614MaqMes, 1) ;
            AV26Final = GXutil.eomdate( AV25Actual) ;
            AV24DiasMes = (byte)(GXutil.day( AV26Final)) ;
            if ( AV34Mes == AV33UMes )
            {
               AV24DiasMes = AV32UDia ;
            }
            while ( AV23Puntero <= AV24DiasMes )
            {
               AV13Inicio = (byte)(AV23Puntero*2) ;
               AV18HorCar = GXutil.substring( A610MaqHNPMes, AV13Inicio, 2) ;
               AV12Horas = (byte)(GXutil.lval( AV18HorCar)) ;
               if ( AV12Horas == 0 )
               {
                  AV27TotDias = (short)(AV27TotDias+1) ;
               }
               AV23Puntero = (byte)(AV23Puntero+1) ;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV23Puntero = (byte)(1) ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdiaslab.this.A396EmprCod;
      this.aP1[0] = pdiaslab.this.AV28PFecha;
      this.aP2[0] = pdiaslab.this.AV29UFecha;
      this.aP3[0] = pdiaslab.this.AV27TotDias;
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
      P021J2_A396EmprCod = new String[] {""} ;
      P021J2_A614MaqMes = new byte[1] ;
      P021J2_A599MaqAny = new short[1] ;
      P021J2_A602MaqCod = new String[] {""} ;
      P021J2_A610MaqHNPMes = new String[] {""} ;
      P021J2_n610MaqHNPMes = new boolean[] {false} ;
      A602MaqCod = "" ;
      A610MaqHNPMes = "" ;
      AV25Actual = GXutil.nullDate() ;
      AV26Final = GXutil.nullDate() ;
      AV18HorCar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdiaslab__default(),
         new Object[] {
             new Object[] {
            P021J2_A396EmprCod, P021J2_A614MaqMes, P021J2_A599MaqAny, P021J2_A602MaqCod, P021J2_A610MaqHNPMes, P021J2_n610MaqHNPMes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12Horas ;
   private byte AV35Dia ;
   private byte AV34Mes ;
   private byte AV14PDia ;
   private byte AV11PMes ;
   private byte AV32UDia ;
   private byte AV33UMes ;
   private byte AV23Puntero ;
   private byte A614MaqMes ;
   private byte AV24DiasMes ;
   private byte AV13Inicio ;
   private short AV27TotDias ;
   private short AV10Any ;
   private short AV30PAny ;
   private short AV31UAny ;
   private short A599MaqAny ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String AV18HorCar ;
   private java.util.Date AV28PFecha ;
   private java.util.Date AV29UFecha ;
   private java.util.Date AV25Actual ;
   private java.util.Date AV26Final ;
   private boolean returnInSub ;
   private boolean n610MaqHNPMes ;
   private String A610MaqHNPMes ;
   private short[] aP3 ;
   private String[] aP0 ;
   private java.util.Date[] aP1 ;
   private java.util.Date[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P021J2_A396EmprCod ;
   private byte[] P021J2_A614MaqMes ;
   private short[] P021J2_A599MaqAny ;
   private String[] P021J2_A602MaqCod ;
   private String[] P021J2_A610MaqHNPMes ;
   private boolean[] P021J2_n610MaqHNPMes ;
}

final  class pdiaslab__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P021J2", "SELECT EmprCod, MaqMes, MaqAny, MaqCod, MaqHNPMes FROM TXPMAQHNP WHERE (EmprCod = ?) AND (MaqAny = ?) AND (MaqMes = ?) ORDER BY EmprCod, MaqCod, MaqAny, MaqMes ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

