package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclaesp7 extends GXProcedure
{
   public pclaesp7( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclaesp7.class ), "" );
   }

   public pclaesp7( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             byte[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             byte[] aP8 ,
                             int[] aP9 )
   {
      pclaesp7.this.aP10 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        byte[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        byte[] aP8 ,
                        int[] aP9 ,
                        String[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             byte[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             byte[] aP8 ,
                             int[] aP9 ,
                             String[] aP10 )
   {
      pclaesp7.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclaesp7.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pclaesp7.this.A494ForSer = aP2[0];
      this.aP2 = aP2;
      pclaesp7.this.A482ForColNom = aP3[0];
      this.aP3 = aP3;
      pclaesp7.this.A483ForColNum = aP4[0];
      this.aP4 = aP4;
      pclaesp7.this.A831TipColCod = aP5[0];
      this.aP5 = aP5;
      pclaesp7.this.AV15Familia = aP6[0];
      this.aP6 = aP6;
      pclaesp7.this.AV16TotCol = aP7[0];
      this.aP7 = aP7;
      pclaesp7.this.AV17FlagCol = aP8[0];
      this.aP8 = aP8;
      pclaesp7.this.AV21Lb_numero = aP9[0];
      this.aP9 = aP9;
      pclaesp7.this.AV22Lb_opcion = aP10[0];
      this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV23fam1d1 ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FAM1D1", ""), GXv_int2) ;
      pclaesp7.this.GXt_int1 = GXv_int2[0] ;
      AV23fam1d1 = GXt_int1 ;
      AV17FlagCol = (byte)(0) ;
      /* Using cursor P03362 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV21Lb_numero), AV22Lb_opcion});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5555Lb_opcion = P03362_A5555Lb_opcion[0] ;
         A5532Lb_numero = P03362_A5532Lb_numero[0] ;
         A719PrdNum = P03362_A719PrdNum[0] ;
         A5558LB_CantC = P03362_A5558LB_CantC[0] ;
         A5557Lb_LineaC = P03362_A5557Lb_LineaC[0] ;
         AV19Length = (byte)(GXutil.len( A719PrdNum)) ;
         if ( AV15Familia == 0 )
         {
            AV16TotCol = AV16TotCol.add(A5558LB_CantC) ;
            AV17FlagCol = (byte)(1) ;
         }
         else
         {
            if ( AV19Length > 5 )
            {
               AV20FamiliaA = GXutil.str( AV15Familia, 1, 1) ;
               if ( ( ( CommonUtil.decimalVal( GXutil.substring( A719PrdNum, 1, 2), ".").doubleValue() == AV15Familia ) && ( AV23fam1d1 == 0 ) ) || ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), AV20FamiliaA) == 0 ) && ( AV23fam1d1 == 1 ) ) )
               {
                  AV16TotCol = AV16TotCol.add(A5558LB_CantC) ;
                  AV17FlagCol = (byte)(1) ;
               }
            }
            else
            {
               AV20FamiliaA = GXutil.str( AV15Familia, 1, 1) ;
               if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), AV20FamiliaA) == 0 )
               {
                  AV16TotCol = AV16TotCol.add(A5558LB_CantC) ;
                  AV17FlagCol = (byte)(1) ;
               }
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclaesp7.this.A396EmprCod;
      this.aP1[0] = pclaesp7.this.A252CliCod;
      this.aP2[0] = pclaesp7.this.A494ForSer;
      this.aP3[0] = pclaesp7.this.A482ForColNom;
      this.aP4[0] = pclaesp7.this.A483ForColNum;
      this.aP5[0] = pclaesp7.this.A831TipColCod;
      this.aP6[0] = pclaesp7.this.AV15Familia;
      this.aP7[0] = pclaesp7.this.AV16TotCol;
      this.aP8[0] = pclaesp7.this.AV17FlagCol;
      this.aP9[0] = pclaesp7.this.AV21Lb_numero;
      this.aP10[0] = pclaesp7.this.AV22Lb_opcion;
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
      P03362_A396EmprCod = new String[] {""} ;
      P03362_A5555Lb_opcion = new String[] {""} ;
      P03362_A5532Lb_numero = new int[1] ;
      P03362_A719PrdNum = new String[] {""} ;
      P03362_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03362_A5557Lb_LineaC = new short[1] ;
      A5555Lb_opcion = "" ;
      A719PrdNum = "" ;
      A5558LB_CantC = DecimalUtil.ZERO ;
      AV20FamiliaA = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclaesp7__default(),
         new Object[] {
             new Object[] {
            P03362_A396EmprCod, P03362_A5555Lb_opcion, P03362_A5532Lb_numero, P03362_A719PrdNum, P03362_A5558LB_CantC, P03362_A5557Lb_LineaC
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte AV15Familia ;
   private byte AV17FlagCol ;
   private byte AV23fam1d1 ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV19Length ;
   private short A5557Lb_LineaC ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int AV21Lb_numero ;
   private int A5532Lb_numero ;
   private java.math.BigDecimal AV16TotCol ;
   private java.math.BigDecimal A5558LB_CantC ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String AV22Lb_opcion ;
   private String scmdbuf ;
   private String A5555Lb_opcion ;
   private String A719PrdNum ;
   private String AV20FamiliaA ;
   private String[] aP10 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private byte[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private byte[] aP8 ;
   private int[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P03362_A396EmprCod ;
   private String[] P03362_A5555Lb_opcion ;
   private int[] P03362_A5532Lb_numero ;
   private String[] P03362_A719PrdNum ;
   private java.math.BigDecimal[] P03362_A5558LB_CantC ;
   private short[] P03362_A5557Lb_LineaC ;
}

final  class pclaesp7__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03362", "SELECT EmprCod, Lb_opcion, Lb_numero, PrdNum, LB_CantC, Lb_LineaC FROM TXPENS003 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion, Lb_LineaC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
               stmt.setString(3, (String)parms[2], 1);
               return;
      }
   }

}

