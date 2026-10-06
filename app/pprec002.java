package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprec002 extends GXProcedure
{
   public pprec002( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprec002.class ), "" );
   }

   public pprec002( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          String[] aP4 ,
                          String[] aP5 )
   {
      pprec002.this.aP6 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 )
   {
      pprec002.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprec002.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pprec002.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pprec002.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pprec002.this.AV10ALbrloc = aP4[0];
      this.aP4 = aP4;
      pprec002.this.AV12Loc = aP5[0];
      this.aP5 = aP5;
      pprec002.this.AV11Albreccod = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10ALbrloc = " " ;
      AV11Albreccod = 0 ;
      AV12Loc = "" ;
      /* Using cursor P03KF2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A50AlbRLoc = P03KF2_A50AlbRLoc[0] ;
         A44AlbRecCod = P03KF2_A44AlbRecCod[0] ;
         A200BarPieCod = P03KF2_A200BarPieCod[0] ;
         A50AlbRLoc = P03KF2_A50AlbRLoc[0] ;
         if ( GXutil.strcmp(AV10ALbrloc, "") == 0 )
         {
            AV10ALbrloc = GXutil.trim( A50AlbRLoc) ;
         }
         else
         {
            AV10ALbrloc += "/" + GXutil.trim( A50AlbRLoc) ;
         }
         AV11Albreccod = A44AlbRecCod ;
         AV12Loc = A50AlbRLoc ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprec002.this.A396EmprCod;
      this.aP1[0] = pprec002.this.A129BarCod;
      this.aP2[0] = pprec002.this.A132BarCodReo;
      this.aP3[0] = pprec002.this.A130BarCodPar;
      this.aP4[0] = pprec002.this.AV10ALbrloc;
      this.aP5[0] = pprec002.this.AV12Loc;
      this.aP6[0] = pprec002.this.AV11Albreccod;
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
      P03KF2_A396EmprCod = new String[] {""} ;
      P03KF2_A129BarCod = new int[1] ;
      P03KF2_A132BarCodReo = new byte[1] ;
      P03KF2_A130BarCodPar = new String[] {""} ;
      P03KF2_A50AlbRLoc = new String[] {""} ;
      P03KF2_A44AlbRecCod = new int[1] ;
      P03KF2_A200BarPieCod = new String[] {""} ;
      A50AlbRLoc = "" ;
      A200BarPieCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprec002__default(),
         new Object[] {
             new Object[] {
            P03KF2_A396EmprCod, P03KF2_A129BarCod, P03KF2_A132BarCodReo, P03KF2_A130BarCodPar, P03KF2_A50AlbRLoc, P03KF2_A44AlbRecCod, P03KF2_A200BarPieCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV11Albreccod ;
   private int A44AlbRecCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV10ALbrloc ;
   private String AV12Loc ;
   private String scmdbuf ;
   private String A50AlbRLoc ;
   private String A200BarPieCod ;
   private int[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P03KF2_A396EmprCod ;
   private int[] P03KF2_A129BarCod ;
   private byte[] P03KF2_A132BarCodReo ;
   private String[] P03KF2_A130BarCodPar ;
   private String[] P03KF2_A50AlbRLoc ;
   private int[] P03KF2_A44AlbRecCod ;
   private String[] P03KF2_A200BarPieCod ;
}

final  class pprec002__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03KF2", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.AlbRLoc, T1.AlbRecCod, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
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
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

