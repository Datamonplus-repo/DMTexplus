package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pgbarpar extends GXProcedure
{
   public pgbarpar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgbarpar.class ), "" );
   }

   public pgbarpar( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 ,
                            String[] aP4 )
   {
      pgbarpar.this.aP5 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 )
   {
      pgbarpar.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pgbarpar.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pgbarpar.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pgbarpar.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pgbarpar.this.A758ProCod = aP4[0];
      this.aP4 = aP4;
      pgbarpar.this.A194BarOrdLin = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV11Nocommit ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCOMM", ""), GXv_int2) ;
      pgbarpar.this.GXt_int1 = GXv_int2[0] ;
      AV11Nocommit = GXt_int1 ;
      /* Using cursor P00LY2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P00LY2_A252CliCod[0] ;
         n252CliCod = P00LY2_n252CliCod[0] ;
         A212BarSer = P00LY2_A212BarSer[0] ;
         A457FasCod = P00LY2_A457FasCod[0] ;
         A252CliCod = P00LY2_A252CliCod[0] ;
         n252CliCod = P00LY2_n252CliCod[0] ;
         A212BarSer = P00LY2_A212BarSer[0] ;
         AV8vCliCod = A252CliCod ;
         AV9vArtCod = A212BarSer ;
         AV10vFasCod = A457FasCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P00LY3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV8vCliCod), AV9vArtCod, A758ProCod, AV10vFasCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A1673ParFasObs = P00LY3_A1673ParFasObs[0] ;
         A1668ParFasVal = P00LY3_A1668ParFasVal[0] ;
         A1664ParFasCod = P00LY3_A1664ParFasCod[0] ;
         A457FasCod = P00LY3_A457FasCod[0] ;
         A65ArtCod = P00LY3_A65ArtCod[0] ;
         A252CliCod = P00LY3_A252CliCod[0] ;
         n252CliCod = P00LY3_n252CliCod[0] ;
         /*
            INSERT RECORD ON TABLE TXPBarPar

         */
         A3296BarParObs = A1673ParFasObs ;
         A3295BarParVal = A1668ParFasVal ;
         A9737BarValPar = GXutil.space( (short)(8)) ;
         /* Using cursor P00LY4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A1664ParFasCod), A3295BarParVal, A3296BarParObs, A9737BarValPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBarPar");
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
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( AV11Nocommit == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pgbarpar");
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pgbarpar.this.A396EmprCod;
      this.aP1[0] = pgbarpar.this.A129BarCod;
      this.aP2[0] = pgbarpar.this.A132BarCodReo;
      this.aP3[0] = pgbarpar.this.A130BarCodPar;
      this.aP4[0] = pgbarpar.this.A758ProCod;
      this.aP5[0] = pgbarpar.this.A194BarOrdLin;
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
      P00LY2_A396EmprCod = new String[] {""} ;
      P00LY2_A129BarCod = new int[1] ;
      P00LY2_A132BarCodReo = new byte[1] ;
      P00LY2_A130BarCodPar = new String[] {""} ;
      P00LY2_A758ProCod = new String[] {""} ;
      P00LY2_A194BarOrdLin = new short[1] ;
      P00LY2_A252CliCod = new int[1] ;
      P00LY2_n252CliCod = new boolean[] {false} ;
      P00LY2_A212BarSer = new String[] {""} ;
      P00LY2_A457FasCod = new String[] {""} ;
      A212BarSer = "" ;
      A457FasCod = "" ;
      AV9vArtCod = "" ;
      AV10vFasCod = "" ;
      P00LY3_A396EmprCod = new String[] {""} ;
      P00LY3_A758ProCod = new String[] {""} ;
      P00LY3_A1673ParFasObs = new String[] {""} ;
      P00LY3_A1668ParFasVal = new String[] {""} ;
      P00LY3_A1664ParFasCod = new short[1] ;
      P00LY3_A457FasCod = new String[] {""} ;
      P00LY3_A65ArtCod = new String[] {""} ;
      P00LY3_A252CliCod = new int[1] ;
      P00LY3_n252CliCod = new boolean[] {false} ;
      A1673ParFasObs = "" ;
      A1668ParFasVal = "" ;
      A65ArtCod = "" ;
      A3296BarParObs = "" ;
      A3295BarParVal = "" ;
      A9737BarValPar = "" ;
      Gx_emsg = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pgbarpar__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pgbarpar__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pgbarpar__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pgbarpar__default(),
         new Object[] {
             new Object[] {
            P00LY2_A396EmprCod, P00LY2_A129BarCod, P00LY2_A132BarCodReo, P00LY2_A130BarCodPar, P00LY2_A758ProCod, P00LY2_A194BarOrdLin, P00LY2_A252CliCod, P00LY2_n252CliCod, P00LY2_A212BarSer, P00LY2_A457FasCod
            }
            , new Object[] {
            P00LY3_A396EmprCod, P00LY3_A758ProCod, P00LY3_A1673ParFasObs, P00LY3_A1668ParFasVal, P00LY3_A1664ParFasCod, P00LY3_A457FasCod, P00LY3_A65ArtCod, P00LY3_A252CliCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV11Nocommit ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short A194BarOrdLin ;
   private short A1664ParFasCod ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int AV8vCliCod ;
   private int GX_INS475 ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String scmdbuf ;
   private String A212BarSer ;
   private String A457FasCod ;
   private String AV9vArtCod ;
   private String AV10vFasCod ;
   private String A1673ParFasObs ;
   private String A1668ParFasVal ;
   private String A65ArtCod ;
   private String A3296BarParObs ;
   private String A3295BarParVal ;
   private String A9737BarValPar ;
   private String Gx_emsg ;
   private boolean n252CliCod ;
   private short[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00LY2_A396EmprCod ;
   private int[] P00LY2_A129BarCod ;
   private byte[] P00LY2_A132BarCodReo ;
   private String[] P00LY2_A130BarCodPar ;
   private String[] P00LY2_A758ProCod ;
   private short[] P00LY2_A194BarOrdLin ;
   private int[] P00LY2_A252CliCod ;
   private boolean[] P00LY2_n252CliCod ;
   private String[] P00LY2_A212BarSer ;
   private String[] P00LY2_A457FasCod ;
   private String[] P00LY3_A396EmprCod ;
   private String[] P00LY3_A758ProCod ;
   private String[] P00LY3_A1673ParFasObs ;
   private String[] P00LY3_A1668ParFasVal ;
   private short[] P00LY3_A1664ParFasCod ;
   private String[] P00LY3_A457FasCod ;
   private String[] P00LY3_A65ArtCod ;
   private int[] P00LY3_A252CliCod ;
   private boolean[] P00LY3_n252CliCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pgbarpar__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pgbarpar__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pgbarpar__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pgbarpar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00LY2", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T2.CliCod, T2.BarSer, T1.FasCod FROM (TXPBARFAS T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T1.BarOrdLin = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00LY3", "SELECT EmprCod, ProCod, ParFasObs, ParFasVal, ParFasCod, FasCod, ArtCod, CliCod FROM TXPSERPAR WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00LY4", "INSERT INTO TXPBarPar(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ParFasCod, BarParVal, BarParObs, BarValPar, BarParTxt, Itm_ord5, BarParVl2, BarParVMn, BarParVMx, BarParPLC) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', ' ', ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBarPar")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((int[]) buf[7])[0] = rslt.getInt(8);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 8);
               stmt.setString(9, (String)parms[8], 60);
               stmt.setString(10, (String)parms[9], 8);
               return;
      }
   }

}

