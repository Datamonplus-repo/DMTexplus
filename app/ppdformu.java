package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppdformu extends GXProcedure
{
   public ppdformu( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppdformu.class ), "" );
   }

   public ppdformu( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 )
   {
      ppdformu.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      ppdformu.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppdformu.this.AV8ForNumCol = aP1[0];
      this.aP1 = aP1;
      ppdformu.this.AV9ValCon = aP2[0];
      this.aP2 = aP2;
      ppdformu.this.AV10FlagModC = aP3[0];
      this.aP3 = aP3;
      ppdformu.this.AV18Op = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV12GruPrd ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "GRUPRD", ""), GXv_int2) ;
      ppdformu.this.GXt_int1 = GXv_int2[0] ;
      AV12GruPrd = GXt_int1 ;
      AV13Cdform = (byte)(0) ;
      AV16ColUltLin = (short)(0) ;
      /* Using cursor P02FJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8ForNumCol)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A486ForNumCol = P02FJ2_A486ForNumCol[0] ;
         A310ColUltLin = P02FJ2_A310ColUltLin[0] ;
         AV13Cdform = (byte)(1) ;
         AV16ColUltLin = A310ColUltLin ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV14Ldform = (byte)(0) ;
      AV15Collin = (short)(0) ;
      /* Using cursor P02FJ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV8ForNumCol)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A486ForNumCol = P02FJ3_A486ForNumCol[0] ;
         A309ColLin = P02FJ3_A309ColLin[0] ;
         AV14Ldform = (byte)(1) ;
         AV15Collin = A309ColLin ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( AV13Cdform == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPCDFORM

         */
         A486ForNumCol = AV8ForNumCol ;
         A310ColUltLin = (short)(0) ;
         A315ContNum = 10 ;
         A318CosKgm = DecimalUtil.doubleToDec(0) ;
         A741PrdUltLin = (short)(0) ;
         A6310Lb_TaAuxC = " " ;
         n6310Lb_TaAuxC = false ;
         A6371Lb_fam3 = (byte)(0) ;
         A6370Lb_fam2 = (byte)(0) ;
         A6369Lb_fam1 = (byte)(0) ;
         /* Using cursor P02FJ4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A310ColUltLin), Integer.valueOf(A315ContNum), A318CosKgm, Short.valueOf(A741PrdUltLin), Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC, Byte.valueOf(A6369Lb_fam1), Byte.valueOf(A6370Lb_fam2), Byte.valueOf(A6371Lb_fam3)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDFORM");
         if ( (pr_default.getStatus(2) == 1) )
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
         Application.commitDataStores(context, remoteHandle, pr_default, "ppdformu");
      }
      if ( ( AV13Cdform == 1 ) && ( AV16ColUltLin == 0 ) )
      {
         /* Optimized UPDATE. */
         /* Using cursor P02FJ5 */
         pr_default.execute(3, new Object[] {Short.valueOf(AV15Collin), A396EmprCod, Integer.valueOf(AV8ForNumCol)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDFORM");
         /* End optimized UPDATE. */
         Application.commitDataStores(context, remoteHandle, pr_default, "ppdformu");
      }
      httpContext.popup(formatLink("app.formulaciontinte.tdformu", new String[] {GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "UPD", ""))),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8ForNumCol,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9ValCon,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10FlagModC,1,0)),GXutil.URLEncode(GXutil.rtrim(AV18Op))}, new String[] {"Mode","EmprCod","ForNumCol","ContNum","FlagMod","ForOpcCli"}) , new Object[] {});
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppdformu.this.A396EmprCod;
      this.aP1[0] = ppdformu.this.AV8ForNumCol;
      this.aP2[0] = ppdformu.this.AV9ValCon;
      this.aP3[0] = ppdformu.this.AV10FlagModC;
      this.aP4[0] = ppdformu.this.AV18Op;
      Application.commitDataStores(context, remoteHandle, pr_default, "ppdformu");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P02FJ2_A396EmprCod = new String[] {""} ;
      P02FJ2_A486ForNumCol = new int[1] ;
      P02FJ2_A310ColUltLin = new short[1] ;
      P02FJ3_A396EmprCod = new String[] {""} ;
      P02FJ3_A486ForNumCol = new int[1] ;
      P02FJ3_A309ColLin = new short[1] ;
      A318CosKgm = DecimalUtil.ZERO ;
      A6310Lb_TaAuxC = "" ;
      Gx_emsg = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ppdformu__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ppdformu__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ppdformu__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppdformu__default(),
         new Object[] {
             new Object[] {
            P02FJ2_A396EmprCod, P02FJ2_A486ForNumCol, P02FJ2_A310ColUltLin
            }
            , new Object[] {
            P02FJ3_A396EmprCod, P02FJ3_A486ForNumCol, P02FJ3_A309ColLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10FlagModC ;
   private byte AV12GruPrd ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV13Cdform ;
   private byte AV14Ldform ;
   private byte A6371Lb_fam3 ;
   private byte A6370Lb_fam2 ;
   private byte A6369Lb_fam1 ;
   private short AV16ColUltLin ;
   private short A310ColUltLin ;
   private short AV15Collin ;
   private short A309ColLin ;
   private short A741PrdUltLin ;
   private short Gx_err ;
   private int AV8ForNumCol ;
   private int AV9ValCon ;
   private int A486ForNumCol ;
   private int GX_INS32 ;
   private int A315ContNum ;
   private java.math.BigDecimal A318CosKgm ;
   private String A396EmprCod ;
   private String AV18Op ;
   private String scmdbuf ;
   private String A6310Lb_TaAuxC ;
   private String Gx_emsg ;
   private boolean n6310Lb_TaAuxC ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02FJ2_A396EmprCod ;
   private int[] P02FJ2_A486ForNumCol ;
   private short[] P02FJ2_A310ColUltLin ;
   private String[] P02FJ3_A396EmprCod ;
   private int[] P02FJ3_A486ForNumCol ;
   private short[] P02FJ3_A309ColLin ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class ppdformu__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
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
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class ppdformu__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
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
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class ppdformu__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
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
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class ppdformu__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02FJ2", "SELECT EmprCod, ForNumCol, ColUltLin FROM TXPCDFORM WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02FJ3", "SELECT EmprCod, ForNumCol, ColLin FROM TXPLDFORM WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol, ColLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02FJ4", "INSERT INTO TXPCDFORM(EmprCod, ForNumCol, ColUltLin, ContNum, CosKgm, PrdUltLin, Lb_TaAuxC, Lb_fam1, Lb_fam2, Lb_fam3) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCDFORM")
         ,new UpdateCursor("P02FJ5", "UPDATE TXPCDFORM SET ContNum=10, ColUltLin=?  WHERE EmprCod = ? and ForNumCol = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCDFORM")
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
            case 1 :
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
               return;
            case 2 :
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
            case 3 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

