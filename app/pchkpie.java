package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pchkpie extends GXProcedure
{
   public pchkpie( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pchkpie.class ), "" );
   }

   public pchkpie( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            String[] aP2 ,
                            java.math.BigDecimal[] aP3 ,
                            java.math.BigDecimal[] aP4 ,
                            byte[] aP5 ,
                            String[] aP6 )
   {
      pchkpie.this.aP7 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        short[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             short[] aP7 )
   {
      pchkpie.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pchkpie.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
      pchkpie.this.A2159AlbRecPie = aP2[0];
      this.aP2 = aP2;
      pchkpie.this.AV16AlbRecKgm = aP3[0];
      this.aP3 = aP3;
      pchkpie.this.AV17AlbRecMtr = aP4[0];
      this.aP4 = aP4;
      pchkpie.this.AV15FlagPie = aP5[0];
      this.aP5 = aP5;
      pchkpie.this.AV20AlbRLoc = aP6[0];
      this.aP6 = aP6;
      pchkpie.this.AV22AlbRecAnh = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV19FlagPRef ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PZAREF", ""), GXv_int1) ;
      pchkpie.this.AV19FlagPRef = GXv_int1[0] ;
      GXv_int1[0] = AV18FlagTexk ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TEXKNI", ""), GXv_int1) ;
      pchkpie.this.AV18FlagTexk = GXv_int1[0] ;
      GXv_int1[0] = AV21Martex ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MARTEX", ""), GXv_int1) ;
      pchkpie.this.AV21Martex = GXv_int1[0] ;
      AV15FlagPie = (byte)(2) ;
      AV16AlbRecKgm = DecimalUtil.doubleToDec(0) ;
      AV17AlbRecMtr = DecimalUtil.doubleToDec(0) ;
      AV23AlbRUni = "*" ;
      /* Using cursor P00CK2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A56AlbRUni = P00CK2_A56AlbRUni[0] ;
         A2156AlbRecKgmU = P00CK2_A2156AlbRecKgmU[0] ;
         A2155AlbRecKgm = P00CK2_A2155AlbRecKgm[0] ;
         A2158AlbRecMtrU = P00CK2_A2158AlbRecMtrU[0] ;
         A2157AlbRecMtr = P00CK2_A2157AlbRecMtr[0] ;
         A3731AlbRecIdPz = P00CK2_A3731AlbRecIdPz[0] ;
         A50AlbRLoc = P00CK2_A50AlbRLoc[0] ;
         A2154AlbRecAnh = P00CK2_A2154AlbRecAnh[0] ;
         A4921AlbRAnc = P00CK2_A4921AlbRAnc[0] ;
         A56AlbRUni = P00CK2_A56AlbRUni[0] ;
         A50AlbRLoc = P00CK2_A50AlbRLoc[0] ;
         A4921AlbRAnc = P00CK2_A4921AlbRAnc[0] ;
         AV15FlagPie = (byte)(1) ;
         AV23AlbRUni = A56AlbRUni ;
         AV16AlbRecKgm = A2155AlbRecKgm.subtract(A2156AlbRecKgmU) ;
         AV17AlbRecMtr = A2157AlbRecMtr.subtract(A2158AlbRecMtrU) ;
         if ( AV19FlagPRef == 1 )
         {
            AV20AlbRLoc = GXutil.substring( A3731AlbRecIdPz, 1, 10) ;
         }
         else if ( ( AV18FlagTexk == 1 ) || ( AV21Martex == 1 ) )
         {
            if ( GXutil.strcmp(A3731AlbRecIdPz, httpContext.getMessage( "AUTOMATICO", "")) == 0 )
            {
               AV20AlbRLoc = GXutil.substring( A3731AlbRecIdPz, 1, 10) ;
            }
            else
            {
               AV20AlbRLoc = A50AlbRLoc ;
            }
         }
         else
         {
            AV20AlbRLoc = A50AlbRLoc ;
         }
         AV22AlbRecAnh = A2154AlbRecAnh ;
         if ( (0==AV22AlbRecAnh) )
         {
            AV22AlbRecAnh = A4921AlbRAnc ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( ( AV16AlbRecKgm.doubleValue() == 0 ) && ( GXutil.strcmp(AV23AlbRUni, httpContext.getMessage( "K", "")) == 0 ) )
      {
         AV15FlagPie = (byte)(2) ;
      }
      if ( ( AV17AlbRecMtr.doubleValue() == 0 ) && ( GXutil.strcmp(AV23AlbRUni, httpContext.getMessage( "M", "")) == 0 ) )
      {
         AV15FlagPie = (byte)(2) ;
      }
      Gx_msg = httpContext.getMessage( "&FlagPie=", "") + GXutil.str( AV15FlagPie, 1, 0) + GXutil.chr( (short)(13)) ;
      System.out.println( Gx_msg );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pchkpie.this.A396EmprCod;
      this.aP1[0] = pchkpie.this.A44AlbRecCod;
      this.aP2[0] = pchkpie.this.A2159AlbRecPie;
      this.aP3[0] = pchkpie.this.AV16AlbRecKgm;
      this.aP4[0] = pchkpie.this.AV17AlbRecMtr;
      this.aP5[0] = pchkpie.this.AV15FlagPie;
      this.aP6[0] = pchkpie.this.AV20AlbRLoc;
      this.aP7[0] = pchkpie.this.AV22AlbRecAnh;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      AV23AlbRUni = "" ;
      scmdbuf = "" ;
      P00CK2_A396EmprCod = new String[] {""} ;
      P00CK2_A44AlbRecCod = new int[1] ;
      P00CK2_A2159AlbRecPie = new String[] {""} ;
      P00CK2_A56AlbRUni = new String[] {""} ;
      P00CK2_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00CK2_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00CK2_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00CK2_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00CK2_A3731AlbRecIdPz = new String[] {""} ;
      P00CK2_A50AlbRLoc = new String[] {""} ;
      P00CK2_A2154AlbRecAnh = new short[1] ;
      P00CK2_A4921AlbRAnc = new short[1] ;
      A56AlbRUni = "" ;
      A2156AlbRecKgmU = DecimalUtil.ZERO ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      A3731AlbRecIdPz = "" ;
      A50AlbRLoc = "" ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pchkpie__default(),
         new Object[] {
             new Object[] {
            P00CK2_A396EmprCod, P00CK2_A44AlbRecCod, P00CK2_A2159AlbRecPie, P00CK2_A56AlbRUni, P00CK2_A2156AlbRecKgmU, P00CK2_A2155AlbRecKgm, P00CK2_A2158AlbRecMtrU, P00CK2_A2157AlbRecMtr, P00CK2_A3731AlbRecIdPz, P00CK2_A50AlbRLoc,
            P00CK2_A2154AlbRecAnh, P00CK2_A4921AlbRAnc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15FlagPie ;
   private byte AV19FlagPRef ;
   private byte AV18FlagTexk ;
   private byte AV21Martex ;
   private byte GXv_int1[] ;
   private short AV22AlbRecAnh ;
   private short A2154AlbRecAnh ;
   private short A4921AlbRAnc ;
   private short Gx_err ;
   private int A44AlbRecCod ;
   private java.math.BigDecimal AV16AlbRecKgm ;
   private java.math.BigDecimal AV17AlbRecMtr ;
   private java.math.BigDecimal A2156AlbRecKgmU ;
   private java.math.BigDecimal A2155AlbRecKgm ;
   private java.math.BigDecimal A2158AlbRecMtrU ;
   private java.math.BigDecimal A2157AlbRecMtr ;
   private String A396EmprCod ;
   private String A2159AlbRecPie ;
   private String AV20AlbRLoc ;
   private String AV23AlbRUni ;
   private String scmdbuf ;
   private String A56AlbRUni ;
   private String A3731AlbRecIdPz ;
   private String A50AlbRLoc ;
   private String Gx_msg ;
   private short[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P00CK2_A396EmprCod ;
   private int[] P00CK2_A44AlbRecCod ;
   private String[] P00CK2_A2159AlbRecPie ;
   private String[] P00CK2_A56AlbRUni ;
   private java.math.BigDecimal[] P00CK2_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] P00CK2_A2155AlbRecKgm ;
   private java.math.BigDecimal[] P00CK2_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] P00CK2_A2157AlbRecMtr ;
   private String[] P00CK2_A3731AlbRecIdPz ;
   private String[] P00CK2_A50AlbRLoc ;
   private short[] P00CK2_A2154AlbRecAnh ;
   private short[] P00CK2_A4921AlbRAnc ;
}

final  class pchkpie__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00CK2", "SELECT T1.EmprCod, T1.AlbRecCod, T1.AlbRecPie, T2.AlbRUni, T1.AlbRecKgmU, T1.AlbRecKgm, T1.AlbRecMtrU, T1.AlbRecMtr, T1.AlbRecIdPz, T2.AlbRLoc, T1.AlbRecAnh, T2.AlbRAnc FROM (TXPALBDET T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? and T1.AlbRecPie = ? ORDER BY T1.EmprCod, T1.AlbRecCod, T1.AlbRecPie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 15);
               ((String[]) buf[9])[0] = rslt.getString(10, 10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
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
               stmt.setString(3, (String)parms[2], 9);
               return;
      }
   }

}

