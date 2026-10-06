package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class paltpro extends GXProcedure
{
   public paltpro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( paltpro.class ), "" );
   }

   public paltpro( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 ,
                            int[] aP2 ,
                            String[] aP3 ,
                            String[] aP4 ,
                            int[] aP5 ,
                            byte[] aP6 )
   {
      paltpro.this.aP7 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 ,
                        byte[] aP6 ,
                        short[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             byte[] aP6 ,
                             short[] aP7 )
   {
      paltpro.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      paltpro.this.AV15MacProCod = aP1[0];
      this.aP1 = aP1;
      paltpro.this.AV16CliCod = aP2[0];
      this.aP2 = aP2;
      paltpro.this.AV17ForSer = aP3[0];
      this.aP3 = aP3;
      paltpro.this.AV18ForColNom = aP4[0];
      this.aP4 = aP4;
      paltpro.this.AV19ForColNum = aP5[0];
      this.aP5 = aP5;
      paltpro.this.AV20TipColCod = aP6[0];
      this.aP6 = aP6;
      paltpro.this.AV21ForUltLin = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV23Num_l ;
      GXv_int2[0] = GXt_int1 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CMACPR", ""), GXv_int2) ;
      paltpro.this.GXt_int1 = GXv_int2[0] ;
      AV23Num_l = (short)(GXt_int1) ;
      AV23Num_l = (short)(((0==AV23Num_l) ? 10 : AV23Num_l)) ;
      AV22ProForL = (short)(0) ;
      /* Using cursor P00AS2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV15MacProCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7787MacPrgNum = P00AS2_A7787MacPrgNum[0] ;
         A10549MacRb = P00AS2_A10549MacRb[0] ;
         A10550MacNH2O = P00AS2_A10550MacNH2O[0] ;
         A764ProForCod = P00AS2_A764ProForCod[0] ;
         A1514MacProCod = P00AS2_A1514MacProCod[0] ;
         A1517MacProLin = P00AS2_A1517MacProLin[0] ;
         AV22ProForL = (short)(AV22ProForL+AV23Num_l) ;
         /*
            INSERT RECORD ON TABLE TXPLFORMU

         */
         A252CliCod = AV16CliCod ;
         A494ForSer = AV17ForSer ;
         A482ForColNom = AV18ForColNom ;
         A483ForColNum = AV19ForColNum ;
         A831TipColCod = AV20TipColCod ;
         A1160ProForL = AV22ProForL ;
         A7802ProFoNPrg = A7787MacPrgNum ;
         A6549ProForFR = httpContext.getMessage( "R", "") ;
         A8656ProForrbn = A10549MacRb ;
         A9704ProForVol = 0 ;
         A9707ProForMq = GXutil.space( (short)(6)) ;
         A10542ProForH2O = A10550MacNH2O ;
         /* Using cursor P00AS3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Short.valueOf(A1160ProForL), A764ProForCod, A6549ProForFR, Integer.valueOf(A7802ProFoNPrg), A8656ProForrbn, Integer.valueOf(A9704ProForVol), A9707ProForMq, Short.valueOf(A10542ProForH2O)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFORMU");
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
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV21ForUltLin = AV22ProForL ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = paltpro.this.A396EmprCod;
      this.aP1[0] = paltpro.this.AV15MacProCod;
      this.aP2[0] = paltpro.this.AV16CliCod;
      this.aP3[0] = paltpro.this.AV17ForSer;
      this.aP4[0] = paltpro.this.AV18ForColNom;
      this.aP5[0] = paltpro.this.AV19ForColNum;
      this.aP6[0] = paltpro.this.AV20TipColCod;
      this.aP7[0] = paltpro.this.AV21ForUltLin;
      Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.paltpro");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new int[1] ;
      scmdbuf = "" ;
      P00AS2_A396EmprCod = new String[] {""} ;
      P00AS2_A7787MacPrgNum = new short[1] ;
      P00AS2_A10549MacRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00AS2_A10550MacNH2O = new short[1] ;
      P00AS2_A764ProForCod = new String[] {""} ;
      P00AS2_A1514MacProCod = new String[] {""} ;
      P00AS2_A1517MacProLin = new short[1] ;
      A10549MacRb = DecimalUtil.ZERO ;
      A764ProForCod = "" ;
      A1514MacProCod = "" ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      A6549ProForFR = "" ;
      A8656ProForrbn = DecimalUtil.ZERO ;
      A9707ProForMq = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.paltpro__default(),
         new Object[] {
             new Object[] {
            P00AS2_A396EmprCod, P00AS2_A7787MacPrgNum, P00AS2_A10549MacRb, P00AS2_A10550MacNH2O, P00AS2_A764ProForCod, P00AS2_A1514MacProCod, P00AS2_A1517MacProLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20TipColCod ;
   private byte A831TipColCod ;
   private short AV21ForUltLin ;
   private short AV23Num_l ;
   private short AV22ProForL ;
   private short A7787MacPrgNum ;
   private short A10550MacNH2O ;
   private short A1517MacProLin ;
   private short A1160ProForL ;
   private short A10542ProForH2O ;
   private short Gx_err ;
   private int AV16CliCod ;
   private int AV19ForColNum ;
   private int GXt_int1 ;
   private int GXv_int2[] ;
   private int GX_INS154 ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int A7802ProFoNPrg ;
   private int A9704ProForVol ;
   private java.math.BigDecimal A10549MacRb ;
   private java.math.BigDecimal A8656ProForrbn ;
   private String A396EmprCod ;
   private String AV15MacProCod ;
   private String AV17ForSer ;
   private String AV18ForColNom ;
   private String scmdbuf ;
   private String A764ProForCod ;
   private String A1514MacProCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String A6549ProForFR ;
   private String A9707ProForMq ;
   private String Gx_emsg ;
   private short[] aP7 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private int[] aP5 ;
   private byte[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P00AS2_A396EmprCod ;
   private short[] P00AS2_A7787MacPrgNum ;
   private java.math.BigDecimal[] P00AS2_A10549MacRb ;
   private short[] P00AS2_A10550MacNH2O ;
   private String[] P00AS2_A764ProForCod ;
   private String[] P00AS2_A1514MacProCod ;
   private short[] P00AS2_A1517MacProLin ;
}

final  class paltpro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00AS2", "SELECT EmprCod, MacPrgNum, MacRb, MacNH2O, ProForCod, MacProCod, MacProLin FROM TXPLMACPR WHERE EmprCod = ? and MacProCod = ? ORDER BY EmprCod, MacProCod, MacProLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00AS3", "INSERT INTO TXPLFORMU(EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL, ProForCod, ProForFR, ProFoNPrg, ProForrbn, ProForVol, ProForMq, ProForH2O, ProforFabs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFORMU")
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 6);
               stmt.setString(9, (String)parms[8], 1);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 2);
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setString(13, (String)parms[12], 6);
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               return;
      }
   }

}

