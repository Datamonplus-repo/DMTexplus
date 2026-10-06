package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class appdisalb extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      appdisalb pgm = new appdisalb (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public appdisalb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( appdisalb.class ), "" );
   }

   public appdisalb( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Inicio----Contruccion DISALB...", "") );
      /* Using cursor P02MC2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P02MC2_A361DisCod[0] ;
         A44AlbRecCod = P02MC2_A44AlbRecCod[0] ;
         A1501BarPiePie = P02MC2_A1501BarPiePie[0] ;
         A203BarPieKil = P02MC2_A203BarPieKil[0] ;
         A205BarPieMet = P02MC2_A205BarPieMet[0] ;
         A130BarCodPar = P02MC2_A130BarCodPar[0] ;
         A132BarCodReo = P02MC2_A132BarCodReo[0] ;
         A129BarCod = P02MC2_A129BarCod[0] ;
         A396EmprCod = P02MC2_A396EmprCod[0] ;
         A200BarPieCod = P02MC2_A200BarPieCod[0] ;
         A361DisCod = P02MC2_A361DisCod[0] ;
         AV8Emprcod = A396EmprCod ;
         AV9Discod = A361DisCod ;
         AV10ALBRECCOD = A44AlbRecCod ;
         AV11PIEZAS = A1501BarPiePie ;
         AV12KILOS = A203BarPieKil ;
         AV13METROS = A205BarPieMet ;
         /* Execute user subroutine: 'DISALB' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Fin----Contruccion DISALB...", ""));
      cleanup();
   }

   public void S111( )
   {
      /* 'DISALB' Routine */
      returnInSub = false ;
      /*
         INSERT RECORD ON TABLE TXPDISALB

      */
      A396EmprCod = AV8Emprcod ;
      A361DisCod = AV9Discod ;
      A44AlbRecCod = AV10ALBRECCOD ;
      A673Piezas = AV11PIEZAS ;
      A595Kilos = AV12KILOS ;
      A631Metros = AV13METROS ;
      A3699KilosUti = DecimalUtil.doubleToDec(0) ;
      n3699KilosUti = false ;
      A3700MetrosUti = DecimalUtil.doubleToDec(0) ;
      n3700MetrosUti = false ;
      A3701PiezasUti = (short)(0) ;
      n3701PiezasUti = false ;
      /* Using cursor P02MC3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), Integer.valueOf(A673Piezas), A595Kilos, A631Metros, Boolean.valueOf(n3699KilosUti), A3699KilosUti, Boolean.valueOf(n3700MetrosUti), A3700MetrosUti, Boolean.valueOf(n3701PiezasUti), Short.valueOf(A3701PiezasUti)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
      if ( (pr_default.getStatus(1) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(ppdisalb.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "appdisalb");
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
      P02MC2_A361DisCod = new int[1] ;
      P02MC2_A44AlbRecCod = new int[1] ;
      P02MC2_A1501BarPiePie = new int[1] ;
      P02MC2_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02MC2_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02MC2_A130BarCodPar = new String[] {""} ;
      P02MC2_A132BarCodReo = new byte[1] ;
      P02MC2_A129BarCod = new int[1] ;
      P02MC2_A396EmprCod = new String[] {""} ;
      P02MC2_A200BarPieCod = new String[] {""} ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A200BarPieCod = "" ;
      AV8Emprcod = "" ;
      AV12KILOS = DecimalUtil.ZERO ;
      AV13METROS = DecimalUtil.ZERO ;
      A595Kilos = DecimalUtil.ZERO ;
      A631Metros = DecimalUtil.ZERO ;
      A3699KilosUti = DecimalUtil.ZERO ;
      A3700MetrosUti = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.appdisalb__default(),
         new Object[] {
             new Object[] {
            P02MC2_A361DisCod, P02MC2_A44AlbRecCod, P02MC2_A1501BarPiePie, P02MC2_A203BarPieKil, P02MC2_A205BarPieMet, P02MC2_A130BarCodPar, P02MC2_A132BarCodReo, P02MC2_A129BarCod, P02MC2_A396EmprCod, P02MC2_A200BarPieCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A3701PiezasUti ;
   private short Gx_err ;
   private int A361DisCod ;
   private int A44AlbRecCod ;
   private int A1501BarPiePie ;
   private int A129BarCod ;
   private int AV9Discod ;
   private int AV10ALBRECCOD ;
   private int AV11PIEZAS ;
   private int GX_INS35 ;
   private int A673Piezas ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal AV12KILOS ;
   private java.math.BigDecimal AV13METROS ;
   private java.math.BigDecimal A595Kilos ;
   private java.math.BigDecimal A631Metros ;
   private java.math.BigDecimal A3699KilosUti ;
   private java.math.BigDecimal A3700MetrosUti ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A200BarPieCod ;
   private String AV8Emprcod ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n3699KilosUti ;
   private boolean n3700MetrosUti ;
   private boolean n3701PiezasUti ;
   private IDataStoreProvider pr_default ;
   private int[] P02MC2_A361DisCod ;
   private int[] P02MC2_A44AlbRecCod ;
   private int[] P02MC2_A1501BarPiePie ;
   private java.math.BigDecimal[] P02MC2_A203BarPieKil ;
   private java.math.BigDecimal[] P02MC2_A205BarPieMet ;
   private String[] P02MC2_A130BarCodPar ;
   private byte[] P02MC2_A132BarCodReo ;
   private int[] P02MC2_A129BarCod ;
   private String[] P02MC2_A396EmprCod ;
   private String[] P02MC2_A200BarPieCod ;
}

final  class appdisalb__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02MC2", "SELECT T2.DisCod, T1.AlbRecCod, T1.BarPiePie, T1.BarPieKil, T1.BarPieMet, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02MC3", "INSERT INTO TXPDISALB(EmprCod, DisCod, AlbRecCod, Piezas, Kilos, Metros, KilosUti, MetrosUti, PiezasUti) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               ((String[]) buf[9])[0] = rslt.getString(10, 9);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[11]).shortValue());
               }
               return;
      }
   }

}

