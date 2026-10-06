package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apdye010 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apdye010 pgm = new apdye010 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apdye010( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apdye010.class ), "" );
   }

   public apdye010( int remoteHandle ,
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
      AV8UsurCod = " " ;
      AV9Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV10EmprCod ;
      GXv_char2[0] = AV11EmprNom ;
      GXv_char3[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char1, GXv_char2, GXv_char3) ;
      apdye010.this.AV10EmprCod = GXv_char1[0] ;
      apdye010.this.AV11EmprNom = GXv_char2[0] ;
      apdye010.this.AV8UsurCod = GXv_char3[0] ;
      /* Using cursor P05AK2 */
      pr_default.execute(0, new Object[] {AV10EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P05AK2_A396EmprCod[0] ;
         A6039RecAcab = P05AK2_A6039RecAcab[0] ;
         n6039RecAcab = P05AK2_n6039RecAcab[0] ;
         A5109RecNumInt = P05AK2_A5109RecNumInt[0] ;
         A602MaqCod = P05AK2_A602MaqCod[0] ;
         A130BarCodPar = P05AK2_A130BarCodPar[0] ;
         A132BarCodReo = P05AK2_A132BarCodReo[0] ;
         A129BarCod = P05AK2_A129BarCod[0] ;
         A2804RecLinMaq = P05AK2_A2804RecLinMaq[0] ;
         if ( GXutil.strcmp(A6039RecAcab, httpContext.getMessage( "S", "")) != 0 )
         {
            AV12DyelotRecipeNo = GXutil.trim( GXutil.str( A5109RecNumInt, 8, 0)) ;
            AV13ReDye = 0 ;
            /* Execute user subroutine: 'DYELOTS' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( AV15State != 9999 )
            {
               AV14Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Lectura DYELOTS.", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + " " + GXutil.str( A5109RecNumInt, 8, 0) + " " + A602MaqCod + " " + GXutil.str( AV15State, 5, 0) + " " + AV16Texplus_ReclinproKey ;
               System.out.println( AV14Control );
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'DYELOTS' Routine */
      returnInSub = false ;
      AV15State = 9999 ;
      AV16Texplus_ReclinproKey = "" ;
      /* Using cursor P05AK3 */
      pr_default.execute(1, new Object[] {AV12DyelotRecipeNo});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A12314ReDye = P05AK3_A12314ReDye[0] ;
         A12313Dyelot = P05AK3_A12313Dyelot[0] ;
         A12381State = P05AK3_A12381State[0] ;
         n12381State = P05AK3_n12381State[0] ;
         AV15State = A12381State ;
         /* Using cursor P05AK4 */
         pr_default.execute(2, new Object[] {A12313Dyelot, Integer.valueOf(A12314ReDye)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A12575Texplus_Re = P05AK4_A12575Texplus_Re[0] ;
            n12575Texplus_Re = P05AK4_n12575Texplus_Re[0] ;
            A12320Correction = P05AK4_A12320Correction[0] ;
            A12321CallOff = P05AK4_A12321CallOff[0] ;
            A12322Counter = P05AK4_A12322Counter[0] ;
            AV16Texplus_ReclinproKey = A12575Texplus_Re ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pdye010.class);
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
      AV8UsurCod = "" ;
      AV9Station = "" ;
      AV10EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P05AK2_A396EmprCod = new String[] {""} ;
      P05AK2_A6039RecAcab = new String[] {""} ;
      P05AK2_n6039RecAcab = new boolean[] {false} ;
      P05AK2_A5109RecNumInt = new int[1] ;
      P05AK2_A602MaqCod = new String[] {""} ;
      P05AK2_A130BarCodPar = new String[] {""} ;
      P05AK2_A132BarCodReo = new byte[1] ;
      P05AK2_A129BarCod = new int[1] ;
      P05AK2_A2804RecLinMaq = new short[1] ;
      A396EmprCod = "" ;
      A6039RecAcab = "" ;
      A602MaqCod = "" ;
      A130BarCodPar = "" ;
      AV12DyelotRecipeNo = "" ;
      AV14Control = "" ;
      AV16Texplus_ReclinproKey = "" ;
      P05AK3_A12314ReDye = new int[1] ;
      P05AK3_A12313Dyelot = new String[] {""} ;
      P05AK3_A12381State = new int[1] ;
      P05AK3_n12381State = new boolean[] {false} ;
      A12313Dyelot = "" ;
      P05AK4_A12313Dyelot = new String[] {""} ;
      P05AK4_A12314ReDye = new int[1] ;
      P05AK4_A12575Texplus_Re = new String[] {""} ;
      P05AK4_n12575Texplus_Re = new boolean[] {false} ;
      P05AK4_A12320Correction = new int[1] ;
      P05AK4_A12321CallOff = new int[1] ;
      P05AK4_A12322Counter = new int[1] ;
      A12575Texplus_Re = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apdye010__default(),
         new Object[] {
             new Object[] {
            P05AK2_A396EmprCod, P05AK2_A6039RecAcab, P05AK2_n6039RecAcab, P05AK2_A5109RecNumInt, P05AK2_A602MaqCod, P05AK2_A130BarCodPar, P05AK2_A132BarCodReo, P05AK2_A129BarCod, P05AK2_A2804RecLinMaq
            }
            , new Object[] {
            P05AK3_A12314ReDye, P05AK3_A12313Dyelot, P05AK3_A12381State, P05AK3_n12381State
            }
            , new Object[] {
            P05AK4_A12313Dyelot, P05AK4_A12314ReDye, P05AK4_A12575Texplus_Re, P05AK4_n12575Texplus_Re, P05AK4_A12320Correction, P05AK4_A12321CallOff, P05AK4_A12322Counter
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int A5109RecNumInt ;
   private int A129BarCod ;
   private int AV13ReDye ;
   private int AV15State ;
   private int A12314ReDye ;
   private int A12381State ;
   private int A12320Correction ;
   private int A12321CallOff ;
   private int A12322Counter ;
   private String AV8UsurCod ;
   private String AV9Station ;
   private String AV10EmprCod ;
   private String GXv_char1[] ;
   private String AV11EmprNom ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A6039RecAcab ;
   private String A602MaqCod ;
   private String A130BarCodPar ;
   private boolean n6039RecAcab ;
   private boolean returnInSub ;
   private boolean n12381State ;
   private boolean n12575Texplus_Re ;
   private String AV12DyelotRecipeNo ;
   private String AV14Control ;
   private String AV16Texplus_ReclinproKey ;
   private String A12313Dyelot ;
   private String A12575Texplus_Re ;
   private IDataStoreProvider pr_default ;
   private String[] P05AK2_A396EmprCod ;
   private String[] P05AK2_A6039RecAcab ;
   private boolean[] P05AK2_n6039RecAcab ;
   private int[] P05AK2_A5109RecNumInt ;
   private String[] P05AK2_A602MaqCod ;
   private String[] P05AK2_A130BarCodPar ;
   private byte[] P05AK2_A132BarCodReo ;
   private int[] P05AK2_A129BarCod ;
   private short[] P05AK2_A2804RecLinMaq ;
   private int[] P05AK3_A12314ReDye ;
   private String[] P05AK3_A12313Dyelot ;
   private int[] P05AK3_A12381State ;
   private boolean[] P05AK3_n12381State ;
   private String[] P05AK4_A12313Dyelot ;
   private int[] P05AK4_A12314ReDye ;
   private String[] P05AK4_A12575Texplus_Re ;
   private boolean[] P05AK4_n12575Texplus_Re ;
   private int[] P05AK4_A12320Correction ;
   private int[] P05AK4_A12321CallOff ;
   private int[] P05AK4_A12322Counter ;
}

final  class apdye010__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05AK2", "SELECT EmprCod, RecAcab, RecNumInt, MaqCod, BarCodPar, BarCodReo, BarCod, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? ORDER BY EmprCod, RecAcab ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05AK3", "SELECT ReDye, Dyelot, State FROM TXPDYE001 WHERE Dyelot = ? ORDER BY Dyelot ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05AK4", "SELECT Dyelot, ReDye, Texplus_Re, Correction, CallOff, Counter FROM TXPDYE002 WHERE Dyelot = ? and ReDye = ? ORDER BY Dyelot, ReDye ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
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
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

