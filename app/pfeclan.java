package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfeclan extends GXProcedure
{
   public pfeclan( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfeclan.class ), "" );
   }

   public pfeclan( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     java.util.Date[] aP1 )
   {
      pfeclan.this.aP2 = new java.util.Date[] {GXutil.nullDate()};
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
      pfeclan.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfeclan.this.AV22UltFec = aP1[0];
      this.aP1 = aP1;
      pfeclan.this.AV23ProFec = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV34FlagVie = (byte)(0) ;
      GXv_int1[0] = AV34FlagVie ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BROSVI", ""), GXv_int1) ;
      pfeclan.this.AV34FlagVie = GXv_int1[0] ;
      AV23ProFec = GXutil.dadd(AV22UltFec,+(1)) ;
      AV26Horas = (byte)(1) ;
      AV29FlagCal = (byte)(1) ;
      while ( ( AV26Horas != 0 ) && ( AV29FlagCal == 1 ) )
      {
         AV28Dia = (byte)(GXutil.day( AV23ProFec)) ;
         AV25Mes = (byte)(GXutil.month( AV23ProFec)) ;
         AV24Any = (short)(GXutil.year( AV23ProFec)) ;
         AV29FlagCal = (byte)(0) ;
         AV26Horas = (byte)(0) ;
         /* Using cursor P00IS2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(AV24Any), Byte.valueOf(AV25Mes)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A614MaqMes = P00IS2_A614MaqMes[0] ;
            A599MaqAny = P00IS2_A599MaqAny[0] ;
            A602MaqCod = P00IS2_A602MaqCod[0] ;
            A610MaqHNPMes = P00IS2_A610MaqHNPMes[0] ;
            n610MaqHNPMes = P00IS2_n610MaqHNPMes[0] ;
            if ( GXutil.strcmp(A602MaqCod, httpContext.getMessage( "TI    ", "")) == 0 )
            {
               AV29FlagCal = (byte)(1) ;
               AV27Inicio = (byte)((AV28Dia*2)) ;
               AV32HorCar = GXutil.substring( A610MaqHNPMes, AV27Inicio, 2) ;
               AV26Horas = (byte)(GXutil.lval( AV32HorCar)) ;
               if ( AV26Horas != 0 )
               {
                  AV23ProFec = GXutil.dadd(AV23ProFec,+(1)) ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
         if ( ( AV34FlagVie == 1 ) && ( GXutil.strcmp(localUtil.cdow( (AV23ProFec), httpContext.getMessage( "spa", "")), httpContext.getMessage( "Viernes", "")) == 0 ) )
         {
            AV23ProFec = GXutil.dadd(AV23ProFec,+(1)) ;
            AV26Horas = (byte)(1) ;
         }
      }
      if ( AV29FlagCal == 0 )
      {
         AV30Mensa = localUtil.dtoc( AV23ProFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         AV31Mens = httpContext.getMessage( "No hay entrada de calendario para la fecha ", "") + AV30Mensa ;
         httpContext.GX_msglist.addItem(AV31Mens);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfeclan.this.A396EmprCod;
      this.aP1[0] = pfeclan.this.AV22UltFec;
      this.aP2[0] = pfeclan.this.AV23ProFec;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P00IS2_A396EmprCod = new String[] {""} ;
      P00IS2_A614MaqMes = new byte[1] ;
      P00IS2_A599MaqAny = new short[1] ;
      P00IS2_A602MaqCod = new String[] {""} ;
      P00IS2_A610MaqHNPMes = new String[] {""} ;
      P00IS2_n610MaqHNPMes = new boolean[] {false} ;
      A602MaqCod = "" ;
      A610MaqHNPMes = "" ;
      AV32HorCar = "" ;
      AV30Mensa = "" ;
      AV31Mens = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfeclan__default(),
         new Object[] {
             new Object[] {
            P00IS2_A396EmprCod, P00IS2_A614MaqMes, P00IS2_A599MaqAny, P00IS2_A602MaqCod, P00IS2_A610MaqHNPMes, P00IS2_n610MaqHNPMes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV34FlagVie ;
   private byte GXv_int1[] ;
   private byte AV26Horas ;
   private byte AV29FlagCal ;
   private byte AV28Dia ;
   private byte AV25Mes ;
   private byte A614MaqMes ;
   private byte AV27Inicio ;
   private short AV24Any ;
   private short A599MaqAny ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String AV32HorCar ;
   private String AV30Mensa ;
   private String AV31Mens ;
   private java.util.Date AV22UltFec ;
   private java.util.Date AV23ProFec ;
   private boolean n610MaqHNPMes ;
   private String A610MaqHNPMes ;
   private java.util.Date[] aP2 ;
   private String[] aP0 ;
   private java.util.Date[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00IS2_A396EmprCod ;
   private byte[] P00IS2_A614MaqMes ;
   private short[] P00IS2_A599MaqAny ;
   private String[] P00IS2_A602MaqCod ;
   private String[] P00IS2_A610MaqHNPMes ;
   private boolean[] P00IS2_n610MaqHNPMes ;
}

final  class pfeclan__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00IS2", "SELECT EmprCod, MaqMes, MaqAny, MaqCod, MaqHNPMes FROM TXPMAQHNP WHERE (EmprCod = ?) AND (MaqAny = ?) AND (MaqMes = ?) ORDER BY EmprCod, MaqCod, MaqAny, MaqMes ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

