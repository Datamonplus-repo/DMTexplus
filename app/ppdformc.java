package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppdformc extends GXProcedure
{
   public ppdformc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppdformc.class ), "" );
   }

   public ppdformc( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      ppdformc.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      ppdformc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppdformc.this.AV12ForNumCol = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16Cdform = (byte)(0) ;
      AV19ColUltLin = (short)(0) ;
      /* Using cursor P02WG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV12ForNumCol)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A486ForNumCol = P02WG2_A486ForNumCol[0] ;
         A310ColUltLin = P02WG2_A310ColUltLin[0] ;
         AV16Cdform = (byte)(1) ;
         AV19ColUltLin = A310ColUltLin ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( (0==AV16Cdform) )
      {
         /*
            INSERT RECORD ON TABLE TXPCDFORM

         */
         A486ForNumCol = AV12ForNumCol ;
         A310ColUltLin = (short)(0) ;
         A315ContNum = 10 ;
         A318CosKgm = DecimalUtil.ZERO ;
         A741PrdUltLin = (short)(0) ;
         A6310Lb_TaAuxC = "" ;
         n6310Lb_TaAuxC = false ;
         A6371Lb_fam3 = (byte)(0) ;
         A6370Lb_fam2 = (byte)(0) ;
         A6369Lb_fam1 = (byte)(0) ;
         /* Using cursor P02WG3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A310ColUltLin), Integer.valueOf(A315ContNum), A318CosKgm, Short.valueOf(A741PrdUltLin), Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC, Byte.valueOf(A6369Lb_fam1), Byte.valueOf(A6370Lb_fam2), Byte.valueOf(A6371Lb_fam3)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDFORM");
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
         new app.pcommit(remoteHandle, context).execute( ) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppdformc.this.A396EmprCod;
      this.aP1[0] = ppdformc.this.AV12ForNumCol;
      Application.commitDataStores(context, remoteHandle, pr_default, "ppdformc");
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
      P02WG2_A396EmprCod = new String[] {""} ;
      P02WG2_A486ForNumCol = new int[1] ;
      P02WG2_A310ColUltLin = new short[1] ;
      A318CosKgm = DecimalUtil.ZERO ;
      A6310Lb_TaAuxC = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppdformc__default(),
         new Object[] {
             new Object[] {
            P02WG2_A396EmprCod, P02WG2_A486ForNumCol, P02WG2_A310ColUltLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16Cdform ;
   private byte A6371Lb_fam3 ;
   private byte A6370Lb_fam2 ;
   private byte A6369Lb_fam1 ;
   private short AV19ColUltLin ;
   private short A310ColUltLin ;
   private short A741PrdUltLin ;
   private short Gx_err ;
   private int AV12ForNumCol ;
   private int A486ForNumCol ;
   private int GX_INS32 ;
   private int A315ContNum ;
   private java.math.BigDecimal A318CosKgm ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A6310Lb_TaAuxC ;
   private String Gx_emsg ;
   private boolean n6310Lb_TaAuxC ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P02WG2_A396EmprCod ;
   private int[] P02WG2_A486ForNumCol ;
   private short[] P02WG2_A310ColUltLin ;
}

final  class ppdformc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02WG2", "SELECT EmprCod, ForNumCol, ColUltLin FROM TXPCDFORM WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02WG3", "INSERT INTO TXPCDFORM(EmprCod, ForNumCol, ColUltLin, ContNum, CosKgm, PrdUltLin, Lb_TaAuxC, Lb_fam1, Lb_fam2, Lb_fam3) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCDFORM")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 4);
               }
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               stmt.setByte(9, ((Number) parms[9]).byteValue());
               stmt.setByte(10, ((Number) parms[10]).byteValue());
               return;
      }
   }

}

