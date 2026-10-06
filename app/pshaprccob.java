package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pshaprccob extends GXProcedure
{
   public pshaprccob( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pshaprccob.class ), "" );
   }

   public pshaprccob( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 ,
                                           String[] aP2 )
   {
      pshaprccob.this.aP3 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 )
   {
      pshaprccob.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pshaprccob.this.A7031ShaCod = aP1[0];
      this.aP1 = aP1;
      pshaprccob.this.AV8TipMaq = aP2[0];
      this.aP2 = aP2;
      pshaprccob.this.AV9MolPrcCob = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( GXutil.strcmp(AV8TipMaq, httpContext.getMessage( "R", "")) == 0 )
      {
         /* Using cursor P02QI2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A7031ShaCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A7042ShaDibInt = P02QI2_A7042ShaDibInt[0] ;
            A7041ShaDibCli = P02QI2_A7041ShaDibCli[0] ;
            AV14GXLvl5 = (byte)(0) ;
            /* Using cursor P02QI3 */
            pr_default.execute(1, new Object[] {A396EmprCod, A7041ShaDibCli, Integer.valueOf(A7042ShaDibInt)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A1013DibCli = P02QI3_A1013DibCli[0] ;
               A1014DibInt = P02QI3_A1014DibInt[0] ;
               A1807DibLinCil = P02QI3_A1807DibLinCil[0] ;
               A4860DibPrcCob = P02QI3_A4860DibPrcCob[0] ;
               n4860DibPrcCob = P02QI3_n4860DibPrcCob[0] ;
               A252CliCod = P02QI3_A252CliCod[0] ;
               AV14GXLvl5 = (byte)(1) ;
               AV9MolPrcCob = A4860DibPrcCob ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            if ( AV14GXLvl5 == 0 )
            {
               AV9MolPrcCob = DecimalUtil.doubleToDec(0) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
      }
      else
      {
         /* Using cursor P02QI4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A7031ShaCod});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A7042ShaDibInt = P02QI4_A7042ShaDibInt[0] ;
            A7041ShaDibCli = P02QI4_A7041ShaDibCli[0] ;
            AV16GXLvl18 = (byte)(0) ;
            /* Using cursor P02QI5 */
            pr_default.execute(3, new Object[] {A396EmprCod, A7041ShaDibCli, Integer.valueOf(A7042ShaDibInt)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A1013DibCli = P02QI5_A1013DibCli[0] ;
               A1014DibInt = P02QI5_A1014DibInt[0] ;
               A1029DibLin = P02QI5_A1029DibLin[0] ;
               A5381DibPrcCobM = P02QI5_A5381DibPrcCobM[0] ;
               n5381DibPrcCobM = P02QI5_n5381DibPrcCobM[0] ;
               A252CliCod = P02QI5_A252CliCod[0] ;
               AV16GXLvl18 = (byte)(1) ;
               AV9MolPrcCob = A5381DibPrcCobM ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            if ( AV16GXLvl18 == 0 )
            {
               AV9MolPrcCob = DecimalUtil.doubleToDec(0) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pshaprccob.this.A396EmprCod;
      this.aP1[0] = pshaprccob.this.A7031ShaCod;
      this.aP2[0] = pshaprccob.this.AV8TipMaq;
      this.aP3[0] = pshaprccob.this.AV9MolPrcCob;
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
      P02QI2_A396EmprCod = new String[] {""} ;
      P02QI2_A7031ShaCod = new String[] {""} ;
      P02QI2_A7042ShaDibInt = new int[1] ;
      P02QI2_A7041ShaDibCli = new String[] {""} ;
      A7041ShaDibCli = "" ;
      P02QI3_A396EmprCod = new String[] {""} ;
      P02QI3_A1013DibCli = new String[] {""} ;
      P02QI3_A1014DibInt = new int[1] ;
      P02QI3_A1807DibLinCil = new short[1] ;
      P02QI3_A4860DibPrcCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02QI3_n4860DibPrcCob = new boolean[] {false} ;
      P02QI3_A252CliCod = new int[1] ;
      A1013DibCli = "" ;
      A4860DibPrcCob = DecimalUtil.ZERO ;
      P02QI4_A396EmprCod = new String[] {""} ;
      P02QI4_A7031ShaCod = new String[] {""} ;
      P02QI4_A7042ShaDibInt = new int[1] ;
      P02QI4_A7041ShaDibCli = new String[] {""} ;
      P02QI5_A396EmprCod = new String[] {""} ;
      P02QI5_A1013DibCli = new String[] {""} ;
      P02QI5_A1014DibInt = new int[1] ;
      P02QI5_A1029DibLin = new short[1] ;
      P02QI5_A5381DibPrcCobM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02QI5_n5381DibPrcCobM = new boolean[] {false} ;
      P02QI5_A252CliCod = new int[1] ;
      A5381DibPrcCobM = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pshaprccob__default(),
         new Object[] {
             new Object[] {
            P02QI2_A396EmprCod, P02QI2_A7031ShaCod, P02QI2_A7042ShaDibInt, P02QI2_A7041ShaDibCli
            }
            , new Object[] {
            P02QI3_A396EmprCod, P02QI3_A1013DibCli, P02QI3_A1014DibInt, P02QI3_A1807DibLinCil, P02QI3_A4860DibPrcCob, P02QI3_n4860DibPrcCob, P02QI3_A252CliCod
            }
            , new Object[] {
            P02QI4_A396EmprCod, P02QI4_A7031ShaCod, P02QI4_A7042ShaDibInt, P02QI4_A7041ShaDibCli
            }
            , new Object[] {
            P02QI5_A396EmprCod, P02QI5_A1013DibCli, P02QI5_A1014DibInt, P02QI5_A1029DibLin, P02QI5_A5381DibPrcCobM, P02QI5_n5381DibPrcCobM, P02QI5_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14GXLvl5 ;
   private byte AV16GXLvl18 ;
   private short A1807DibLinCil ;
   private short A1029DibLin ;
   private short Gx_err ;
   private int A7042ShaDibInt ;
   private int A1014DibInt ;
   private int A252CliCod ;
   private java.math.BigDecimal AV9MolPrcCob ;
   private java.math.BigDecimal A4860DibPrcCob ;
   private java.math.BigDecimal A5381DibPrcCobM ;
   private String A396EmprCod ;
   private String A7031ShaCod ;
   private String AV8TipMaq ;
   private String scmdbuf ;
   private String A7041ShaDibCli ;
   private String A1013DibCli ;
   private boolean n4860DibPrcCob ;
   private boolean n5381DibPrcCobM ;
   private java.math.BigDecimal[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02QI2_A396EmprCod ;
   private String[] P02QI2_A7031ShaCod ;
   private int[] P02QI2_A7042ShaDibInt ;
   private String[] P02QI2_A7041ShaDibCli ;
   private String[] P02QI3_A396EmprCod ;
   private String[] P02QI3_A1013DibCli ;
   private int[] P02QI3_A1014DibInt ;
   private short[] P02QI3_A1807DibLinCil ;
   private java.math.BigDecimal[] P02QI3_A4860DibPrcCob ;
   private boolean[] P02QI3_n4860DibPrcCob ;
   private int[] P02QI3_A252CliCod ;
   private String[] P02QI4_A396EmprCod ;
   private String[] P02QI4_A7031ShaCod ;
   private int[] P02QI4_A7042ShaDibInt ;
   private String[] P02QI4_A7041ShaDibCli ;
   private String[] P02QI5_A396EmprCod ;
   private String[] P02QI5_A1013DibCli ;
   private int[] P02QI5_A1014DibInt ;
   private short[] P02QI5_A1029DibLin ;
   private java.math.BigDecimal[] P02QI5_A5381DibPrcCobM ;
   private boolean[] P02QI5_n5381DibPrcCobM ;
   private int[] P02QI5_A252CliCod ;
}

final  class pshaprccob__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02QI2", "SELECT EmprCod, ShaCod, ShaDibInt, ShaDibCli FROM TXPShablo WHERE EmprCod = ? and ShaCod = ? ORDER BY EmprCod, ShaCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02QI3", "SELECT * FROM (SELECT EmprCod, DibCli, DibInt, DibLinCil, DibPrcCob, CliCod FROM TXPLDIBUC WHERE (EmprCod = ? and DibCli = ?) AND (DibInt = ?) ORDER BY EmprCod, DibCli) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02QI4", "SELECT EmprCod, ShaCod, ShaDibInt, ShaDibCli FROM TXPShablo WHERE EmprCod = ? and ShaCod = ? ORDER BY EmprCod, ShaCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02QI5", "SELECT * FROM (SELECT EmprCod, DibCli, DibInt, DibLin, DibPrcCobM, CliCod FROM TXPLDIBUJ WHERE (EmprCod = ? and DibCli = ?) AND (DibInt = ?) ORDER BY EmprCod, DibCli) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

