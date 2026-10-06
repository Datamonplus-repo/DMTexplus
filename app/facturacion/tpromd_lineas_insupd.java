package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tpromd_lineas_insupd extends GXProcedure
{
   public tpromd_lineas_insupd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpromd_lineas_insupd.class ), "" );
   }

   public tpromd_lineas_insupd( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short aP2 ,
                        int aP3 ,
                        java.math.BigDecimal aP4 ,
                        java.math.BigDecimal aP5 ,
                        java.math.BigDecimal aP6 ,
                        java.math.BigDecimal aP7 ,
                        java.util.Date aP8 ,
                        String aP9 ,
                        int aP10 ,
                        java.math.BigDecimal aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short aP2 ,
                             int aP3 ,
                             java.math.BigDecimal aP4 ,
                             java.math.BigDecimal aP5 ,
                             java.math.BigDecimal aP6 ,
                             java.math.BigDecimal aP7 ,
                             java.util.Date aP8 ,
                             String aP9 ,
                             int aP10 ,
                             java.math.BigDecimal aP11 )
   {
      tpromd_lineas_insupd.this.AV18EmprCod = aP0;
      tpromd_lineas_insupd.this.AV19CliCod = aP1;
      tpromd_lineas_insupd.this.AV20PMDCod = aP2;
      tpromd_lineas_insupd.this.AV8PMDColNum = aP3;
      tpromd_lineas_insupd.this.AV9PMDPreKgm = aP4;
      tpromd_lineas_insupd.this.AV10PMDEntKgm = aP5;
      tpromd_lineas_insupd.this.AV11PMDDtoTin = aP6;
      tpromd_lineas_insupd.this.AV12PMDDtoAca = aP7;
      tpromd_lineas_insupd.this.AV13PMDValFch = aP8;
      tpromd_lineas_insupd.this.AV14PMDColCli = aP9;
      tpromd_lineas_insupd.this.AV15PMDConCod = aP10;
      tpromd_lineas_insupd.this.AV16PMDPreUni = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23GXLvl3 = (byte)(0) ;
      /* Optimized UPDATE. */
      /* Using cursor P0AMW2 */
      pr_default.execute(0, new Object[] {AV12PMDDtoAca, AV13PMDValFch, AV16PMDPreUni, AV9PMDPreKgm, AV10PMDEntKgm, AV11PMDDtoTin, Integer.valueOf(AV15PMDConCod), AV14PMDColCli, AV18EmprCod, Integer.valueOf(AV19CliCod), Short.valueOf(AV20PMDCod), Integer.valueOf(AV8PMDColNum)});
      if ( (pr_default.getStatus(0) != 101) )
      {
         AV23GXLvl3 = (byte)(1) ;
      }
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPProMD1");
      /* End optimized UPDATE. */
      if ( AV23GXLvl3 == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPProMD1

         */
         A396EmprCod = AV18EmprCod ;
         A252CliCod = AV19CliCod ;
         A8391PMDCod = AV20PMDCod ;
         A8393PMDColNum = AV8PMDColNum ;
         A8530PMDColCli = AV14PMDColCli ;
         A8531PMDConCod = AV15PMDConCod ;
         A8397PMDDtoTin = AV11PMDDtoTin ;
         A8396PMDEntKgm = AV10PMDEntKgm ;
         A8395PMDPreKgm = AV9PMDPreKgm ;
         A8532PMDPreUni = AV16PMDPreUni ;
         A8399PMDValFch = AV13PMDValFch ;
         A8398PMDDtoAca = AV12PMDDtoAca ;
         /* Using cursor P0AMW3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod), Integer.valueOf(A8393PMDColNum), A8395PMDPreKgm, A8396PMDEntKgm, A8397PMDDtoTin, A8398PMDDtoAca, A8399PMDValFch, A8530PMDColCli, Integer.valueOf(A8531PMDConCod), A8532PMDPreUni});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPProMD1");
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
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.tpromd_lineas_insupd");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A8398PMDDtoAca = DecimalUtil.ZERO ;
      A8399PMDValFch = GXutil.nullDate() ;
      A8532PMDPreUni = DecimalUtil.ZERO ;
      A8395PMDPreKgm = DecimalUtil.ZERO ;
      A8396PMDEntKgm = DecimalUtil.ZERO ;
      A8397PMDDtoTin = DecimalUtil.ZERO ;
      A8530PMDColCli = "" ;
      A396EmprCod = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpromd_lineas_insupd__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV23GXLvl3 ;
   private short AV20PMDCod ;
   private short A8391PMDCod ;
   private short Gx_err ;
   private int AV19CliCod ;
   private int AV8PMDColNum ;
   private int AV15PMDConCod ;
   private int A8531PMDConCod ;
   private int GX_INS1159 ;
   private int A252CliCod ;
   private int A8393PMDColNum ;
   private java.math.BigDecimal AV9PMDPreKgm ;
   private java.math.BigDecimal AV10PMDEntKgm ;
   private java.math.BigDecimal AV11PMDDtoTin ;
   private java.math.BigDecimal AV12PMDDtoAca ;
   private java.math.BigDecimal AV16PMDPreUni ;
   private java.math.BigDecimal A8398PMDDtoAca ;
   private java.math.BigDecimal A8532PMDPreUni ;
   private java.math.BigDecimal A8395PMDPreKgm ;
   private java.math.BigDecimal A8396PMDEntKgm ;
   private java.math.BigDecimal A8397PMDDtoTin ;
   private String AV18EmprCod ;
   private String AV14PMDColCli ;
   private String A8530PMDColCli ;
   private String A396EmprCod ;
   private String Gx_emsg ;
   private java.util.Date AV13PMDValFch ;
   private java.util.Date A8399PMDValFch ;
   private IDataStoreProvider pr_default ;
}

final  class tpromd_lineas_insupd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AMW2", "UPDATE TXPProMD1 SET PMDDtoAca=?, PMDValFch=?, PMDPreUni=?, PMDPreKgm=?, PMDEntKgm=?, PMDDtoTin=?, PMDConCod=?, PMDColCli=?  WHERE EmprCod = ? and CliCod = ? and PMDCod = ? and PMDColNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPProMD1")
         ,new UpdateCursor("P0AMW3", "INSERT INTO TXPProMD1(EmprCod, CliCod, PMDCod, PMDColNum, PMDPreKgm, PMDEntKgm, PMDDtoTin, PMDDtoAca, PMDValFch, PMDColCli, PMDConCod, PMDPreUni) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPProMD1")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 13);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setDate(9, (java.util.Date)parms[8]);
               stmt.setString(10, (String)parms[9], 13);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 5);
               return;
      }
   }

}

