package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdyrp008 extends GXProcedure
{
   public pdyrp008( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdyrp008.class ), "" );
   }

   public pdyrp008( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           int[] aP4 ,
                           byte[] aP5 ,
                           byte[] aP6 ,
                           java.math.BigDecimal[] aP7 )
   {
      pdyrp008.this.aP8 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        byte[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        byte[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             byte[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             byte[] aP8 )
   {
      pdyrp008.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdyrp008.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pdyrp008.this.A494ForSer = aP2[0];
      this.aP2 = aP2;
      pdyrp008.this.A482ForColNom = aP3[0];
      this.aP3 = aP3;
      pdyrp008.this.A483ForColNum = aP4[0];
      this.aP4 = aP4;
      pdyrp008.this.A831TipColCod = aP5[0];
      this.aP5 = aP5;
      pdyrp008.this.AV15Familia = aP6[0];
      this.aP6 = aP6;
      pdyrp008.this.AV16TotCol = aP7[0];
      this.aP7 = aP7;
      pdyrp008.this.AV17FlagCol = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV21fam1d1 ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FAM1D1", ""), GXv_int2) ;
      pdyrp008.this.GXt_int1 = GXv_int2[0] ;
      AV21fam1d1 = GXt_int1 ;
      Gx_msg = httpContext.getMessage( "ClaEsp3", "") ;
      Gx_msg += httpContext.getMessage( "Empresa : ", "") + A396EmprCod + GXutil.chr( (short)(13)) ;
      Gx_msg += httpContext.getMessage( "Ciente : ", "") + GXutil.trim( GXutil.str( A252CliCod, 10, 0)) + GXutil.chr( (short)(13)) ;
      Gx_msg += httpContext.getMessage( "Serie : ", "") + GXutil.trim( A494ForSer) + GXutil.chr( (short)(13)) ;
      Gx_msg += httpContext.getMessage( "Color : ", "") + GXutil.trim( A482ForColNom) + "/" + GXutil.trim( GXutil.str( A483ForColNum, 10, 0)) + ":" + GXutil.trim( GXutil.str( A831TipColCod, 10, 0)) + GXutil.chr( (short)(13)) ;
      Gx_msg += httpContext.getMessage( "Familia : ", "") + GXutil.trim( GXutil.str( AV15Familia, 10, 0)) + GXutil.chr( (short)(13)) ;
      Gx_msg += httpContext.getMessage( "TotCol : ", "") + GXutil.str( AV16TotCol, 15, 5) + GXutil.chr( (short)(13)) ;
      Gx_msg += "...................." + GXutil.chr( (short)(13)) ;
      AV17FlagCol = (byte)(0) ;
      AV25GXLvl14 = (byte)(0) ;
      /* Using cursor P09902 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A486ForNumCol = P09902_A486ForNumCol[0] ;
         AV25GXLvl14 = (byte)(1) ;
         Gx_msg += httpContext.getMessage( "Existe Formula.", "") + GXutil.chr( (short)(13)) ;
         AV26GXLvl17 = (byte)(0) ;
         /* Using cursor P09903 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A719PrdNum = P09903_A719PrdNum[0] ;
            A481ForCan = P09903_A481ForCan[0] ;
            A309ColLin = P09903_A309ColLin[0] ;
            AV26GXLvl17 = (byte)(1) ;
            Gx_msg += httpContext.getMessage( "->Colorante : ", "") + A719PrdNum + GXutil.chr( (short)(13)) ;
            AV19Length = (byte)(GXutil.len( A719PrdNum)) ;
            if ( AV15Familia == 0 )
            {
               AV16TotCol = AV16TotCol.add(A481ForCan) ;
               AV17FlagCol = (byte)(1) ;
            }
            else
            {
               if ( AV19Length > 5 )
               {
                  Gx_msg += httpContext.getMessage( "-->6 digitos ", "") + GXutil.chr( (short)(13)) ;
                  AV20FamiliaA = GXutil.str( AV15Familia, 1, 1) ;
                  if ( ( ( CommonUtil.decimalVal( GXutil.substring( A719PrdNum, 1, 2), ".").doubleValue() == AV15Familia ) && ( AV21fam1d1 == 0 ) ) || ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), AV20FamiliaA) == 0 ) && ( AV21fam1d1 == 1 ) ) )
                  {
                     Gx_msg += httpContext.getMessage( "--->Coincide Familia", "") + GXutil.chr( (short)(13)) ;
                     Gx_msg += httpContext.getMessage( "-->Qunt.Col : ", "") + GXutil.str( A481ForCan, 10, 4) + GXutil.chr( (short)(13)) ;
                     AV16TotCol = AV16TotCol.add(A481ForCan) ;
                     AV17FlagCol = (byte)(1) ;
                  }
               }
               else
               {
                  Gx_msg += httpContext.getMessage( "*** Familia", "") + GXutil.chr( (short)(13)) ;
                  AV20FamiliaA = GXutil.str( AV15Familia, 1, 1) ;
                  if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), AV20FamiliaA) == 0 )
                  {
                     AV16TotCol = AV16TotCol.add(A481ForCan) ;
                     AV17FlagCol = (byte)(1) ;
                  }
               }
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV26GXLvl17 == 0 )
         {
            Gx_msg += httpContext.getMessage( "No tiene Colorantes", "") + GXutil.chr( (short)(13)) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV25GXLvl14 == 0 )
      {
         Gx_msg += httpContext.getMessage( "No Existe Formula", "") + GXutil.chr( (short)(13)) ;
      }
      Gx_msg += "...................." + GXutil.chr( (short)(13)) ;
      Gx_msg += httpContext.getMessage( "Total Colorantes : ", "") + GXutil.trim( GXutil.str( AV16TotCol, 15, 5)) + GXutil.chr( (short)(13)) ;
      Gx_msg += httpContext.getMessage( "Flag : ", "") + GXutil.trim( GXutil.str( AV17FlagCol, 10, 0)) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdyrp008.this.A396EmprCod;
      this.aP1[0] = pdyrp008.this.A252CliCod;
      this.aP2[0] = pdyrp008.this.A494ForSer;
      this.aP3[0] = pdyrp008.this.A482ForColNom;
      this.aP4[0] = pdyrp008.this.A483ForColNum;
      this.aP5[0] = pdyrp008.this.A831TipColCod;
      this.aP6[0] = pdyrp008.this.AV15Familia;
      this.aP7[0] = pdyrp008.this.AV16TotCol;
      this.aP8[0] = pdyrp008.this.AV17FlagCol;
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
      Gx_msg = "" ;
      scmdbuf = "" ;
      P09902_A396EmprCod = new String[] {""} ;
      P09902_A252CliCod = new int[1] ;
      P09902_A494ForSer = new String[] {""} ;
      P09902_A482ForColNom = new String[] {""} ;
      P09902_A483ForColNum = new int[1] ;
      P09902_A831TipColCod = new byte[1] ;
      P09902_A486ForNumCol = new int[1] ;
      P09903_A396EmprCod = new String[] {""} ;
      P09903_A486ForNumCol = new int[1] ;
      P09903_A719PrdNum = new String[] {""} ;
      P09903_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09903_A309ColLin = new short[1] ;
      A719PrdNum = "" ;
      A481ForCan = DecimalUtil.ZERO ;
      AV20FamiliaA = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdyrp008__default(),
         new Object[] {
             new Object[] {
            P09902_A396EmprCod, P09902_A252CliCod, P09902_A494ForSer, P09902_A482ForColNom, P09902_A483ForColNum, P09902_A831TipColCod, P09902_A486ForNumCol
            }
            , new Object[] {
            P09903_A396EmprCod, P09903_A486ForNumCol, P09903_A719PrdNum, P09903_A481ForCan, P09903_A309ColLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte AV15Familia ;
   private byte AV17FlagCol ;
   private byte AV21fam1d1 ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV25GXLvl14 ;
   private byte AV26GXLvl17 ;
   private byte AV19Length ;
   private short A309ColLin ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int A486ForNumCol ;
   private java.math.BigDecimal AV16TotCol ;
   private java.math.BigDecimal A481ForCan ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String AV20FamiliaA ;
   private byte[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private byte[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P09902_A396EmprCod ;
   private int[] P09902_A252CliCod ;
   private String[] P09902_A494ForSer ;
   private String[] P09902_A482ForColNom ;
   private int[] P09902_A483ForColNum ;
   private byte[] P09902_A831TipColCod ;
   private int[] P09902_A486ForNumCol ;
   private String[] P09903_A396EmprCod ;
   private int[] P09903_A486ForNumCol ;
   private String[] P09903_A719PrdNum ;
   private java.math.BigDecimal[] P09903_A481ForCan ;
   private short[] P09903_A309ColLin ;
}

final  class pdyrp008__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09902", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForNumCol FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09903", "SELECT EmprCod, ForNumCol, PrdNum, ForCan, ColLin FROM TXPLDFORM WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol, ColLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((short[]) buf[4])[0] = rslt.getShort(5);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

