package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodesh extends GXProcedure
{
   public pmodesh( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodesh.class ), "" );
   }

   public pmodesh( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pmodesh.this.aP1 = new int[] {0};
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
      pmodesh.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmodesh.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15FlagMag = (byte)(0) ;
      GXv_int1[0] = AV15FlagMag ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MAGOSA", ""), GXv_int1) ;
      pmodesh.this.AV15FlagMag = GXv_int1[0] ;
      AV16FlagPer = (byte)(0) ;
      GXv_int1[0] = AV16FlagPer ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PERTEX", ""), GXv_int1) ;
      pmodesh.this.AV16FlagPer = GXv_int1[0] ;
      AV17StkCon = (byte)(0) ;
      GXv_int1[0] = AV17StkCon ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "STKCON", ""), GXv_int1) ;
      pmodesh.this.AV17StkCon = GXv_int1[0] ;
      AV26Rontaltex = (byte)(0) ;
      GXv_int1[0] = AV26Rontaltex ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "RONTAL", ""), GXv_int1) ;
      pmodesh.this.AV26Rontaltex = GXv_int1[0] ;
      GXv_int1[0] = AV28StkNeg ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "STKNEG", ""), GXv_int1) ;
      pmodesh.this.AV28StkNeg = GXv_int1[0] ;
      /* Using cursor P00C42 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A966PartCod = P00C42_A966PartCod[0] ;
         n966PartCod = P00C42_n966PartCod[0] ;
         A252CliCod = P00C42_A252CliCod[0] ;
         A367DisEst = P00C42_A367DisEst[0] ;
         A2009DisTipDis = P00C42_A2009DisTipDis[0] ;
         n2009DisTipDis = P00C42_n2009DisTipDis[0] ;
         A1968DisRes = P00C42_A1968DisRes[0] ;
         n1968DisRes = P00C42_n1968DisRes[0] ;
         A375DisNumUni = P00C42_A375DisNumUni[0] ;
         A374DisNumPie = P00C42_A374DisNumPie[0] ;
         A3826RetCod = P00C42_A3826RetCod[0] ;
         n3826RetCod = P00C42_n3826RetCod[0] ;
         AV18PartCod = A966PartCod ;
         AV19CliCod = A252CliCod ;
         if ( A367DisEst == 0 )
         {
            A367DisEst = (byte)(1) ;
         }
         if ( ( ( GXutil.strcmp(A2009DisTipDis, httpContext.getMessage( "P", "")) == 0 ) && ( AV15FlagMag == 1 ) ) || ( ( AV16FlagPer == 1 ) ) || ( ( AV26Rontaltex == 1 ) ) )
         {
         }
         else
         {
            if ( AV28StkNeg == 0 )
            {
               if ( ( AV15FlagMag == 1 ) && ( GXutil.strcmp(A2009DisTipDis, httpContext.getMessage( "M", "")) == 0 ) )
               {
                  A1968DisRes = httpContext.getMessage( "S", "") ;
                  n1968DisRes = false ;
               }
               else
               {
                  GXv_char2[0] = A396EmprCod ;
                  GXv_char3[0] = AV18PartCod ;
                  GXv_int4[0] = AV19CliCod ;
                  GXv_decimal5[0] = AV20PartKilEnt ;
                  GXv_decimal6[0] = AV21PartKilUti ;
                  GXv_decimal7[0] = AV22PartKilSal ;
                  new app.pparkil(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4, GXv_decimal5, GXv_decimal6, GXv_decimal7) ;
                  pmodesh.this.A396EmprCod = GXv_char2[0] ;
                  pmodesh.this.AV18PartCod = GXv_char3[0] ;
                  pmodesh.this.AV19CliCod = GXv_int4[0] ;
                  pmodesh.this.AV20PartKilEnt = GXv_decimal5[0] ;
                  pmodesh.this.AV21PartKilUti = GXv_decimal6[0] ;
                  pmodesh.this.AV22PartKilSal = GXv_decimal7[0] ;
                  GXv_char3[0] = A396EmprCod ;
                  GXv_char2[0] = AV18PartCod ;
                  GXv_int4[0] = AV19CliCod ;
                  GXv_int8[0] = AV23PartConEnt ;
                  GXv_int9[0] = AV24PartConUti ;
                  GXv_int10[0] = AV25PartConSal ;
                  new app.pparcon(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_int4, GXv_int8, GXv_int9, GXv_int10) ;
                  pmodesh.this.A396EmprCod = GXv_char3[0] ;
                  pmodesh.this.AV18PartCod = GXv_char2[0] ;
                  pmodesh.this.AV19CliCod = GXv_int4[0] ;
                  pmodesh.this.AV23PartConEnt = GXv_int8[0] ;
                  pmodesh.this.AV24PartConUti = GXv_int9[0] ;
                  pmodesh.this.AV25PartConSal = GXv_int10[0] ;
                  if ( AV17StkCon == 1 )
                  {
                     if ( DecimalUtil.compareTo(A375DisNumUni, AV22PartKilSal) > 0 )
                     {
                        A1968DisRes = httpContext.getMessage( "S", "") ;
                        n1968DisRes = false ;
                     }
                  }
                  else
                  {
                     if ( ( ( DecimalUtil.compareTo(A375DisNumUni, AV22PartKilSal) > 0 ) ) || ( ( A374DisNumPie > AV25PartConSal ) ) )
                     {
                        A1968DisRes = httpContext.getMessage( "S", "") ;
                        n1968DisRes = false ;
                     }
                  }
               }
            }
            if ( ! (GXutil.strcmp("", A3826RetCod)==0) )
            {
               A1968DisRes = httpContext.getMessage( "S", "") ;
               n1968DisRes = false ;
            }
         }
         /* Using cursor P00C43 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A367DisEst), Boolean.valueOf(n1968DisRes), A1968DisRes, A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmodesh.this.A396EmprCod;
      this.aP1[0] = pmodesh.this.A361DisCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmodesh");
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
      scmdbuf = "" ;
      P00C42_A396EmprCod = new String[] {""} ;
      P00C42_A361DisCod = new int[1] ;
      P00C42_A966PartCod = new String[] {""} ;
      P00C42_n966PartCod = new boolean[] {false} ;
      P00C42_A252CliCod = new int[1] ;
      P00C42_A367DisEst = new byte[1] ;
      P00C42_A2009DisTipDis = new String[] {""} ;
      P00C42_n2009DisTipDis = new boolean[] {false} ;
      P00C42_A1968DisRes = new String[] {""} ;
      P00C42_n1968DisRes = new boolean[] {false} ;
      P00C42_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00C42_A374DisNumPie = new short[1] ;
      P00C42_A3826RetCod = new String[] {""} ;
      P00C42_n3826RetCod = new boolean[] {false} ;
      A966PartCod = "" ;
      A2009DisTipDis = "" ;
      A1968DisRes = "" ;
      A375DisNumUni = DecimalUtil.ZERO ;
      A3826RetCod = "" ;
      AV18PartCod = "" ;
      AV20PartKilEnt = DecimalUtil.ZERO ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      AV21PartKilUti = DecimalUtil.ZERO ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      AV22PartKilSal = DecimalUtil.ZERO ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int8 = new int[1] ;
      GXv_int9 = new int[1] ;
      GXv_int10 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmodesh__default(),
         new Object[] {
             new Object[] {
            P00C42_A396EmprCod, P00C42_A361DisCod, P00C42_A966PartCod, P00C42_n966PartCod, P00C42_A252CliCod, P00C42_A367DisEst, P00C42_A2009DisTipDis, P00C42_n2009DisTipDis, P00C42_A1968DisRes, P00C42_n1968DisRes,
            P00C42_A375DisNumUni, P00C42_A374DisNumPie, P00C42_A3826RetCod, P00C42_n3826RetCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15FlagMag ;
   private byte AV16FlagPer ;
   private byte AV17StkCon ;
   private byte AV26Rontaltex ;
   private byte AV28StkNeg ;
   private byte GXv_int1[] ;
   private byte A367DisEst ;
   private short A374DisNumPie ;
   private short Gx_err ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int AV19CliCod ;
   private int GXv_int4[] ;
   private int AV23PartConEnt ;
   private int GXv_int8[] ;
   private int AV24PartConUti ;
   private int GXv_int9[] ;
   private int AV25PartConSal ;
   private int GXv_int10[] ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal AV20PartKilEnt ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal AV21PartKilUti ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal AV22PartKilSal ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A966PartCod ;
   private String A2009DisTipDis ;
   private String A1968DisRes ;
   private String A3826RetCod ;
   private String AV18PartCod ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private boolean n966PartCod ;
   private boolean n2009DisTipDis ;
   private boolean n1968DisRes ;
   private boolean n3826RetCod ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P00C42_A396EmprCod ;
   private int[] P00C42_A361DisCod ;
   private String[] P00C42_A966PartCod ;
   private boolean[] P00C42_n966PartCod ;
   private int[] P00C42_A252CliCod ;
   private byte[] P00C42_A367DisEst ;
   private String[] P00C42_A2009DisTipDis ;
   private boolean[] P00C42_n2009DisTipDis ;
   private String[] P00C42_A1968DisRes ;
   private boolean[] P00C42_n1968DisRes ;
   private java.math.BigDecimal[] P00C42_A375DisNumUni ;
   private short[] P00C42_A374DisNumPie ;
   private String[] P00C42_A3826RetCod ;
   private boolean[] P00C42_n3826RetCod ;
}

final  class pmodesh__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00C42", "SELECT EmprCod, DisCod, PartCod, CliCod, DisEst, DisTipDis, DisRes, DisNumUni, DisNumPie, RetCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00C43", "UPDATE TXPDISPOS SET DisEst=?, DisRes=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((String[]) buf[12])[0] = rslt.getString(10, 4);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 1);
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
      }
   }

}

