package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apbarmaqcod extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apbarmaqcod pgm = new apbarmaqcod (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apbarmaqcod( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apbarmaqcod.class ), "" );
   }

   public apbarmaqcod( int remoteHandle ,
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
      new app.pdbconn(remoteHandle, context).execute( ) ;
      AV9UsurCod = " " ;
      AV10Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV8Emprcod ;
      GXv_char2[0] = AV11EmprNom ;
      GXv_char3[0] = AV9UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV10Station, GXv_char1, GXv_char2, GXv_char3) ;
      apbarmaqcod.this.AV8Emprcod = GXv_char1[0] ;
      apbarmaqcod.this.AV11EmprNom = GXv_char2[0] ;
      apbarmaqcod.this.AV9UsurCod = GXv_char3[0] ;
      AV12Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Actualizando BARCAD.BarMaqcod", "") ;
      System.out.println( AV12Control );
      /* Using cursor P058Z2 */
      pr_default.execute(0, new Object[] {AV8Emprcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P058Z2_A396EmprCod[0] ;
         A180BarMaqCod = P058Z2_A180BarMaqCod[0] ;
         A130BarCodPar = P058Z2_A130BarCodPar[0] ;
         A132BarCodReo = P058Z2_A132BarCodReo[0] ;
         A129BarCod = P058Z2_A129BarCod[0] ;
         A2805RecVolPrd = P058Z2_A2805RecVolPrd[0] ;
         A5115RecAbsFac = P058Z2_A5115RecAbsFac[0] ;
         A120BarAgrEst = P058Z2_A120BarAgrEst[0] ;
         A602MaqCod = P058Z2_A602MaqCod[0] ;
         A2804RecLinMaq = P058Z2_A2804RecLinMaq[0] ;
         A180BarMaqCod = P058Z2_A180BarMaqCod[0] ;
         A120BarAgrEst = P058Z2_A120BarAgrEst[0] ;
         if ( ( GXutil.strcmp(A602MaqCod, A180BarMaqCod) != 0 ) && ! (GXutil.strcmp("", A602MaqCod)==0) )
         {
            AV12Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Registro.... ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
            System.out.println( AV12Control );
            GXv_char3[0] = A396EmprCod ;
            GXv_int4[0] = A129BarCod ;
            GXv_int5[0] = A132BarCodReo ;
            GXv_char2[0] = A130BarCodPar ;
            GXv_char1[0] = A602MaqCod ;
            GXv_int6[0] = A2805RecVolPrd ;
            GXv_decimal7[0] = A5115RecAbsFac ;
            new app.precmq1(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5, GXv_char2, GXv_char1, GXv_int6, GXv_decimal7) ;
            apbarmaqcod.this.A396EmprCod = GXv_char3[0] ;
            apbarmaqcod.this.A129BarCod = GXv_int4[0] ;
            apbarmaqcod.this.A132BarCodReo = GXv_int5[0] ;
            apbarmaqcod.this.A130BarCodPar = GXv_char2[0] ;
            apbarmaqcod.this.A602MaqCod = GXv_char1[0] ;
            apbarmaqcod.this.A2805RecVolPrd = GXv_int6[0] ;
            apbarmaqcod.this.A5115RecAbsFac = GXv_decimal7[0] ;
            if ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
            {
               GXv_char3[0] = A396EmprCod ;
               GXv_int6[0] = A129BarCod ;
               GXv_int5[0] = A132BarCodReo ;
               GXv_char2[0] = A130BarCodPar ;
               GXv_char1[0] = A602MaqCod ;
               GXv_int4[0] = A2805RecVolPrd ;
               new app.pmodagr(remoteHandle, context).execute( GXv_char3, GXv_int6, GXv_int5, GXv_char2, GXv_char1, GXv_int4) ;
               apbarmaqcod.this.A396EmprCod = GXv_char3[0] ;
               apbarmaqcod.this.A129BarCod = GXv_int6[0] ;
               apbarmaqcod.this.A132BarCodReo = GXv_int5[0] ;
               apbarmaqcod.this.A130BarCodPar = GXv_char2[0] ;
               apbarmaqcod.this.A602MaqCod = GXv_char1[0] ;
               apbarmaqcod.this.A2805RecVolPrd = GXv_int4[0] ;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV12Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " FIN Actualizando BARCAD.BarMaqcod", "") ;
      System.out.println( AV12Control );
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pbarmaqcod.class);
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
      AV9UsurCod = "" ;
      AV10Station = "" ;
      AV8Emprcod = "" ;
      AV11EmprNom = "" ;
      AV12Control = "" ;
      scmdbuf = "" ;
      P058Z2_A396EmprCod = new String[] {""} ;
      P058Z2_A180BarMaqCod = new String[] {""} ;
      P058Z2_A130BarCodPar = new String[] {""} ;
      P058Z2_A132BarCodReo = new byte[1] ;
      P058Z2_A129BarCod = new int[1] ;
      P058Z2_A2805RecVolPrd = new int[1] ;
      P058Z2_A5115RecAbsFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P058Z2_A120BarAgrEst = new String[] {""} ;
      P058Z2_A602MaqCod = new String[] {""} ;
      P058Z2_A2804RecLinMaq = new short[1] ;
      A396EmprCod = "" ;
      A180BarMaqCod = "" ;
      A130BarCodPar = "" ;
      A5115RecAbsFac = DecimalUtil.ZERO ;
      A120BarAgrEst = "" ;
      A602MaqCod = "" ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char2 = new String[1] ;
      GXv_char1 = new String[1] ;
      GXv_int4 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apbarmaqcod__default(),
         new Object[] {
             new Object[] {
            P058Z2_A396EmprCod, P058Z2_A180BarMaqCod, P058Z2_A130BarCodPar, P058Z2_A132BarCodReo, P058Z2_A129BarCod, P058Z2_A2805RecVolPrd, P058Z2_A5115RecAbsFac, P058Z2_A120BarAgrEst, P058Z2_A602MaqCod, P058Z2_A2804RecLinMaq
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte GXv_int5[] ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A2805RecVolPrd ;
   private int GXv_int6[] ;
   private int GXv_int4[] ;
   private java.math.BigDecimal A5115RecAbsFac ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private String AV9UsurCod ;
   private String AV10Station ;
   private String AV8Emprcod ;
   private String AV11EmprNom ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A180BarMaqCod ;
   private String A130BarCodPar ;
   private String A120BarAgrEst ;
   private String A602MaqCod ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String AV12Control ;
   private IDataStoreProvider pr_default ;
   private String[] P058Z2_A396EmprCod ;
   private String[] P058Z2_A180BarMaqCod ;
   private String[] P058Z2_A130BarCodPar ;
   private byte[] P058Z2_A132BarCodReo ;
   private int[] P058Z2_A129BarCod ;
   private int[] P058Z2_A2805RecVolPrd ;
   private java.math.BigDecimal[] P058Z2_A5115RecAbsFac ;
   private String[] P058Z2_A120BarAgrEst ;
   private String[] P058Z2_A602MaqCod ;
   private short[] P058Z2_A2804RecLinMaq ;
}

final  class apbarmaqcod__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P058Z2", "SELECT T1.EmprCod, T2.BarMaqCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.RecVolPrd, T1.RecAbsFac, T2.BarAgrEst, T1.MaqCod, T1.RecLinMaq FROM (TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? ORDER BY T1.EmprCod, T1.MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((short[]) buf[9])[0] = rslt.getShort(10);
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
               return;
      }
   }

}

