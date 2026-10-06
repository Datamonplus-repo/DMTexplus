package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pvercoste extends GXProcedure
{
   public pvercoste( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pvercoste.class ), "" );
   }

   public pvercoste( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 )
   {
      pvercoste.this.aP2 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 )
   {
      pvercoste.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pvercoste.this.A910Workstat = aP1[0];
      this.aP1 = aP1;
      pvercoste.this.AV8Coste_Cor = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV10Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pvercoste.this.GXt_char1 = GXv_char2[0] ;
      AV10Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV12UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV10Station, GXv_char2, GXv_char3, GXv_char4) ;
      pvercoste.this.A396EmprCod = GXv_char2[0] ;
      pvercoste.this.AV11EmprNom = GXv_char3[0] ;
      pvercoste.this.AV12UsurCod = GXv_char4[0] ;
      AV8Coste_Cor = DecimalUtil.doubleToDec(0) ;
      AV9Lb_costec = DecimalUtil.doubleToDec(0) ;
      AV16GXLvl6 = (byte)(0) ;
      /* Using cursor P061G2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A910Workstat});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A891EscMCos = P061G2_A891EscMCos[0] ;
         A719PrdNum = P061G2_A719PrdNum[0] ;
         A887EscMLin = P061G2_A887EscMLin[0] ;
         AV16GXLvl6 = (byte)(1) ;
         AV8Coste_Cor = AV8Coste_Cor.add(A891EscMCos) ;
         if ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "7") <= 0 ) )
         {
            AV9Lb_costec = AV9Lb_costec.add(A891EscMCos) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV16GXLvl6 == 0 )
      {
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pvercoste.this.A396EmprCod;
      this.aP1[0] = pvercoste.this.A910Workstat;
      this.aP2[0] = pvercoste.this.AV8Coste_Cor;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV12UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV9Lb_costec = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P061G2_A396EmprCod = new String[] {""} ;
      P061G2_A910Workstat = new String[] {""} ;
      P061G2_A891EscMCos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P061G2_A719PrdNum = new String[] {""} ;
      P061G2_A887EscMLin = new int[1] ;
      A891EscMCos = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pvercoste__default(),
         new Object[] {
             new Object[] {
            P061G2_A396EmprCod, P061G2_A910Workstat, P061G2_A891EscMCos, P061G2_A719PrdNum, P061G2_A887EscMLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16GXLvl6 ;
   private short Gx_err ;
   private int A887EscMLin ;
   private java.math.BigDecimal AV8Coste_Cor ;
   private java.math.BigDecimal AV9Lb_costec ;
   private java.math.BigDecimal A891EscMCos ;
   private String A396EmprCod ;
   private String A910Workstat ;
   private String AV10Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV12UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private java.math.BigDecimal[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P061G2_A396EmprCod ;
   private String[] P061G2_A910Workstat ;
   private java.math.BigDecimal[] P061G2_A891EscMCos ;
   private String[] P061G2_A719PrdNum ;
   private int[] P061G2_A887EscMLin ;
}

final  class pvercoste__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P061G2", "SELECT EmprCod, Workstat, EscMCos, PrdNum, EscMLin FROM TXPESCMAN WHERE EmprCod = ? and Workstat = ? ORDER BY EmprCod, Workstat, EscMLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((int[]) buf[4])[0] = rslt.getInt(5);
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
               stmt.setString(2, (String)parms[1], 10);
               return;
      }
   }

}

