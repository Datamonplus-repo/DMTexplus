package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmosprl extends GXProcedure
{
   public pmosprl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmosprl.class ), "" );
   }

   public pmosprl( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 )
   {
      pmosprl.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 )
   {
      pmosprl.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pmosprl.this.AV16DisCod = aP1[0];
      this.aP1 = aP1;
      pmosprl.this.AV17ArtCod = aP2[0];
      this.aP2 = aP2;
      pmosprl.this.AV18CliCod = aP3[0];
      this.aP3 = aP3;
      pmosprl.this.AV24MdlCod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19ProCod = "00000003" ;
      /*
         INSERT RECORD ON TABLE TXPDISLIN

      */
      A396EmprCod = AV15EmprCod ;
      A361DisCod = AV16DisCod ;
      A758ProCod = AV19ProCod ;
      A846UltFasLin = (short)(0) ;
      /* Using cursor P01RD2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A846UltFasLin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISLIN");
      if ( (pr_default.getStatus(0) == 1) )
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
      /* Using cursor P01RD3 */
      pr_default.execute(1, new Object[] {AV15EmprCod, AV19ProCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A774ProNumLin = P01RD3_A774ProNumLin[0] ;
         A7744FasPreObl = P01RD3_A7744FasPreObl[0] ;
         n7744FasPreObl = P01RD3_n7744FasPreObl[0] ;
         A758ProCod = P01RD3_A758ProCod[0] ;
         A396EmprCod = P01RD3_A396EmprCod[0] ;
         A457FasCod = P01RD3_A457FasCod[0] ;
         A7744FasPreObl = P01RD3_A7744FasPreObl[0] ;
         n7744FasPreObl = P01RD3_n7744FasPreObl[0] ;
         W396EmprCod = A396EmprCod ;
         W758ProCod = A758ProCod ;
         AV22FasCod = A457FasCod ;
         /*
            INSERT RECORD ON TABLE TXPDISFAS

         */
         W396EmprCod = A396EmprCod ;
         W758ProCod = A758ProCod ;
         W457FasCod = A457FasCod ;
         A396EmprCod = AV15EmprCod ;
         A361DisCod = AV16DisCod ;
         A758ProCod = AV19ProCod ;
         A368DisFasLin = A774ProNumLin ;
         A457FasCod = AV22FasCod ;
         /* Using cursor P01RD4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), A457FasCod, Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
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
         A396EmprCod = W396EmprCod ;
         A758ProCod = W758ProCod ;
         A457FasCod = W457FasCod ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A758ProCod = W758ProCod ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmosprl.this.AV15EmprCod;
      this.aP1[0] = pmosprl.this.AV16DisCod;
      this.aP2[0] = pmosprl.this.AV17ArtCod;
      this.aP3[0] = pmosprl.this.AV18CliCod;
      this.aP4[0] = pmosprl.this.AV24MdlCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmosprl");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV19ProCod = "" ;
      A396EmprCod = "" ;
      A758ProCod = "" ;
      Gx_emsg = "" ;
      scmdbuf = "" ;
      P01RD3_A774ProNumLin = new short[1] ;
      P01RD3_A7744FasPreObl = new byte[1] ;
      P01RD3_n7744FasPreObl = new boolean[] {false} ;
      P01RD3_A758ProCod = new String[] {""} ;
      P01RD3_A396EmprCod = new String[] {""} ;
      P01RD3_A457FasCod = new String[] {""} ;
      A457FasCod = "" ;
      W396EmprCod = "" ;
      W758ProCod = "" ;
      AV22FasCod = "" ;
      W457FasCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmosprl__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P01RD3_A774ProNumLin, P01RD3_A7744FasPreObl, P01RD3_n7744FasPreObl, P01RD3_A758ProCod, P01RD3_A396EmprCod, P01RD3_A457FasCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A7744FasPreObl ;
   private short A846UltFasLin ;
   private short Gx_err ;
   private short A774ProNumLin ;
   private short A368DisFasLin ;
   private int AV16DisCod ;
   private int AV18CliCod ;
   private int GX_INS38 ;
   private int A361DisCod ;
   private int GX_INS39 ;
   private String AV15EmprCod ;
   private String AV17ArtCod ;
   private String AV24MdlCod ;
   private String AV19ProCod ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String Gx_emsg ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String W396EmprCod ;
   private String W758ProCod ;
   private String AV22FasCod ;
   private String W457FasCod ;
   private boolean n7744FasPreObl ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private IDataStoreProvider pr_default ;
   private short[] P01RD3_A774ProNumLin ;
   private byte[] P01RD3_A7744FasPreObl ;
   private boolean[] P01RD3_n7744FasPreObl ;
   private String[] P01RD3_A758ProCod ;
   private String[] P01RD3_A396EmprCod ;
   private String[] P01RD3_A457FasCod ;
}

final  class pmosprl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P01RD2", "INSERT INTO TXPDISLIN(EmprCod, DisCod, ProCod, UltFasLin, DisFasApr, ProSts, ProStsFec) VALUES(?, ?, ?, ?, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISLIN")
         ,new ForEachCursor("P01RD3", "SELECT T1.ProNumLin, T2.FasPreObl, T1.ProCod, T1.EmprCod, T1.FasCod FROM (TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01RD4", "INSERT INTO TXPDISFAS(EmprCod, DisCod, ProCod, DisFasLin, FasCod, FasPreObl, FasApr, DisMaqPru, DisQuiUl, DisFasPre, DisFasUni, DisFasDto, DisFasRec, DisFasAut, Disfastpp, DisFasUpL, DisfasRb, Dta_UOrd, DisFasObs, DisPreSal, DisPrePie, DisVelPro, DisNumPas) VALUES(?, ?, ?, ?, ?, ?, ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISFAS")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
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
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 8);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[6]).byteValue());
               }
               return;
      }
   }

}

