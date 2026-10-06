package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aputil33 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aputil33 pgm = new aputil33 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aputil33( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aputil33.class ), "" );
   }

   public aputil33( int remoteHandle ,
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
      /* Using cursor P020K2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3401DisRefKgs = P020K2_A3401DisRefKgs[0] ;
         n3401DisRefKgs = P020K2_n3401DisRefKgs[0] ;
         A5861DisRefPzII = P020K2_A5861DisRefPzII[0] ;
         n5861DisRefPzII = P020K2_n5861DisRefPzII[0] ;
         A361DisCod = P020K2_A361DisCod[0] ;
         A396EmprCod = P020K2_A396EmprCod[0] ;
         A3608DisRefAlbR = P020K2_A3608DisRefAlbR[0] ;
         n3608DisRefAlbR = P020K2_n3608DisRefAlbR[0] ;
         A3398DisRefBarC = P020K2_A3398DisRefBarC[0] ;
         A3399DisRefBCRe = P020K2_A3399DisRefBCRe[0] ;
         A3400DisRefBCPa = P020K2_A3400DisRefBCPa[0] ;
         A3607DisRefBPie = P020K2_A3607DisRefBPie[0] ;
         if ( (GXutil.strcmp("", A5861DisRefPzII)==0) )
         {
            AV18DisCod = A361DisCod ;
            AV19EmprCod = A396EmprCod ;
            AV21DisRefAlbr = A3608DisRefAlbR ;
            /* Execute user subroutine: 'BUSCA_PIEZA' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            A5861DisRefPzII = AV20DisRefPzII ;
            n5861DisRefPzII = false ;
         }
         /* Using cursor P020K3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n5861DisRefPzII), A5861DisRefPzII, A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A3398DisRefBarC), Byte.valueOf(A3399DisRefBCRe), A3400DisRefBCPa, A3607DisRefBPie});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISREF");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso finalizado", ""));
      cleanup();
   }

   public void S111( )
   {
      /* 'BUSCA_PIEZA' Routine */
      returnInSub = false ;
      AV20DisRefPzII = "" ;
      AV30GXLvl19 = (byte)(0) ;
      /* Using cursor P020K4 */
      pr_default.execute(2, new Object[] {AV19EmprCod, Integer.valueOf(AV18DisCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A361DisCod = P020K4_A361DisCod[0] ;
         A396EmprCod = P020K4_A396EmprCod[0] ;
         A213BarSit = P020K4_A213BarSit[0] ;
         A129BarCod = P020K4_A129BarCod[0] ;
         A132BarCodReo = P020K4_A132BarCodReo[0] ;
         A130BarCodPar = P020K4_A130BarCodPar[0] ;
         AV30GXLvl19 = (byte)(1) ;
         AV22BarCod = A129BarCod ;
         AV23BarCodReo = A132BarCodReo ;
         AV25Encontre = httpContext.getMessage( "S", "") ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( AV30GXLvl19 == 0 )
      {
         AV25Encontre = httpContext.getMessage( "N", "") ;
      }
      if ( GXutil.strcmp(AV25Encontre, httpContext.getMessage( "S", "")) == 0 )
      {
         /* Using cursor P020K5 */
         pr_default.execute(3, new Object[] {AV19EmprCod, Integer.valueOf(AV22BarCod), Byte.valueOf(AV23BarCodReo), AV24barCodPar});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A130BarCodPar = P020K5_A130BarCodPar[0] ;
            A132BarCodReo = P020K5_A132BarCodReo[0] ;
            A129BarCod = P020K5_A129BarCod[0] ;
            A396EmprCod = P020K5_A396EmprCod[0] ;
            A1501BarPiePie = P020K5_A1501BarPiePie[0] ;
            A44AlbRecCod = P020K5_A44AlbRecCod[0] ;
            A200BarPieCod = P020K5_A200BarPieCod[0] ;
            if ( A44AlbRecCod == AV21DisRefAlbr )
            {
               AV20DisRefPzII = A200BarPieCod ;
               AV26Reg = (short)(AV26Reg+1) ;
               Gx_msg = httpContext.getMessage( "Registros modificados ", "") + GXutil.str( AV26Reg, 4, 0) ;
               System.out.println( Gx_msg );
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(3);
         }
         pr_default.close(3);
      }
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(putil33.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aputil33");
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
      P020K2_A3401DisRefKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P020K2_n3401DisRefKgs = new boolean[] {false} ;
      P020K2_A5861DisRefPzII = new String[] {""} ;
      P020K2_n5861DisRefPzII = new boolean[] {false} ;
      P020K2_A361DisCod = new int[1] ;
      P020K2_A396EmprCod = new String[] {""} ;
      P020K2_A3608DisRefAlbR = new int[1] ;
      P020K2_n3608DisRefAlbR = new boolean[] {false} ;
      P020K2_A3398DisRefBarC = new int[1] ;
      P020K2_A3399DisRefBCRe = new byte[1] ;
      P020K2_A3400DisRefBCPa = new String[] {""} ;
      P020K2_A3607DisRefBPie = new String[] {""} ;
      A3401DisRefKgs = DecimalUtil.ZERO ;
      A5861DisRefPzII = "" ;
      A396EmprCod = "" ;
      A3400DisRefBCPa = "" ;
      A3607DisRefBPie = "" ;
      AV19EmprCod = "" ;
      AV20DisRefPzII = "" ;
      P020K4_A361DisCod = new int[1] ;
      P020K4_A396EmprCod = new String[] {""} ;
      P020K4_A213BarSit = new byte[1] ;
      P020K4_A129BarCod = new int[1] ;
      P020K4_A132BarCodReo = new byte[1] ;
      P020K4_A130BarCodPar = new String[] {""} ;
      A130BarCodPar = "" ;
      AV24barCodPar = "" ;
      AV25Encontre = "" ;
      P020K5_A130BarCodPar = new String[] {""} ;
      P020K5_A132BarCodReo = new byte[1] ;
      P020K5_A129BarCod = new int[1] ;
      P020K5_A396EmprCod = new String[] {""} ;
      P020K5_A1501BarPiePie = new int[1] ;
      P020K5_A44AlbRecCod = new int[1] ;
      P020K5_A200BarPieCod = new String[] {""} ;
      A200BarPieCod = "" ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aputil33__default(),
         new Object[] {
             new Object[] {
            P020K2_A3401DisRefKgs, P020K2_n3401DisRefKgs, P020K2_A5861DisRefPzII, P020K2_n5861DisRefPzII, P020K2_A361DisCod, P020K2_A396EmprCod, P020K2_A3608DisRefAlbR, P020K2_n3608DisRefAlbR, P020K2_A3398DisRefBarC, P020K2_A3399DisRefBCRe,
            P020K2_A3400DisRefBCPa, P020K2_A3607DisRefBPie
            }
            , new Object[] {
            }
            , new Object[] {
            P020K4_A361DisCod, P020K4_A396EmprCod, P020K4_A213BarSit, P020K4_A129BarCod, P020K4_A132BarCodReo, P020K4_A130BarCodPar
            }
            , new Object[] {
            P020K5_A130BarCodPar, P020K5_A132BarCodReo, P020K5_A129BarCod, P020K5_A396EmprCod, P020K5_A1501BarPiePie, P020K5_A44AlbRecCod, P020K5_A200BarPieCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A3399DisRefBCRe ;
   private byte A132BarCodReo ;
   private byte AV30GXLvl19 ;
   private byte A213BarSit ;
   private byte AV23BarCodReo ;
   private short AV26Reg ;
   private short Gx_err ;
   private int A361DisCod ;
   private int A3608DisRefAlbR ;
   private int A3398DisRefBarC ;
   private int AV18DisCod ;
   private int AV21DisRefAlbr ;
   private int A129BarCod ;
   private int AV22BarCod ;
   private int A1501BarPiePie ;
   private int A44AlbRecCod ;
   private java.math.BigDecimal A3401DisRefKgs ;
   private String scmdbuf ;
   private String A5861DisRefPzII ;
   private String A396EmprCod ;
   private String A3400DisRefBCPa ;
   private String A3607DisRefBPie ;
   private String AV19EmprCod ;
   private String AV20DisRefPzII ;
   private String A130BarCodPar ;
   private String AV24barCodPar ;
   private String AV25Encontre ;
   private String A200BarPieCod ;
   private String Gx_msg ;
   private boolean n3401DisRefKgs ;
   private boolean n5861DisRefPzII ;
   private boolean n3608DisRefAlbR ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P020K2_A3401DisRefKgs ;
   private boolean[] P020K2_n3401DisRefKgs ;
   private String[] P020K2_A5861DisRefPzII ;
   private boolean[] P020K2_n5861DisRefPzII ;
   private int[] P020K2_A361DisCod ;
   private String[] P020K2_A396EmprCod ;
   private int[] P020K2_A3608DisRefAlbR ;
   private boolean[] P020K2_n3608DisRefAlbR ;
   private int[] P020K2_A3398DisRefBarC ;
   private byte[] P020K2_A3399DisRefBCRe ;
   private String[] P020K2_A3400DisRefBCPa ;
   private String[] P020K2_A3607DisRefBPie ;
   private int[] P020K4_A361DisCod ;
   private String[] P020K4_A396EmprCod ;
   private byte[] P020K4_A213BarSit ;
   private int[] P020K4_A129BarCod ;
   private byte[] P020K4_A132BarCodReo ;
   private String[] P020K4_A130BarCodPar ;
   private String[] P020K5_A130BarCodPar ;
   private byte[] P020K5_A132BarCodReo ;
   private int[] P020K5_A129BarCod ;
   private String[] P020K5_A396EmprCod ;
   private int[] P020K5_A1501BarPiePie ;
   private int[] P020K5_A44AlbRecCod ;
   private String[] P020K5_A200BarPieCod ;
}

final  class aputil33__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P020K2", "SELECT DisRefKgs, DisRefPzII, DisCod, EmprCod, DisRefAlbR, DisRefBarC, DisRefBCRe, DisRefBCPa, DisRefBPie FROM TXPDISREF ORDER BY EmprCod, DisCod, DisRefBarC, DisRefBCRe, DisRefBCPa, DisRefBPie ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P020K3", "UPDATE TXPDISREF SET DisRefPzII=?  WHERE EmprCod = ? AND DisCod = ? AND DisRefBarC = ? AND DisRefBCRe = ? AND DisRefBCPa = ? AND DisRefBPie = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISREF")
         ,new ForEachCursor("P020K4", "SELECT DisCod, EmprCod, BarSit, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P020K5", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarPiePie, AlbRecCod, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 9);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3);
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((String[]) buf[11])[0] = rslt.getString(9, 9);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 9);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 9);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 1);
               stmt.setString(7, (String)parms[7], 9);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

