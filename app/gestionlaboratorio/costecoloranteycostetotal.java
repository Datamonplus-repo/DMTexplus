package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class costecoloranteycostetotal extends GXProcedure
{
   public costecoloranteycostetotal( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( costecoloranteycostetotal.class ), "" );
   }

   public costecoloranteycostetotal( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 ,
                                           java.math.BigDecimal[] aP2 )
   {
      costecoloranteycostetotal.this.aP3 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        java.math.BigDecimal[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 )
   {
      costecoloranteycostetotal.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      costecoloranteycostetotal.this.A910Workstat = aP1[0];
      this.aP1 = aP1;
      costecoloranteycostetotal.this.aP2 = aP2;
      costecoloranteycostetotal.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Coste_Cor = DecimalUtil.doubleToDec(0) ;
      AV9Lb_costec = DecimalUtil.doubleToDec(0) ;
      AV10r = (byte)(1) ;
      /* Using cursor P09PF2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A910Workstat});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A891EscMCos = P09PF2_A891EscMCos[0] ;
         A719PrdNum = P09PF2_A719PrdNum[0] ;
         A887EscMLin = P09PF2_A887EscMLin[0] ;
         AV8Coste_Cor = AV8Coste_Cor.add(A891EscMCos) ;
         if ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "7") <= 0 ) )
         {
            AV9Lb_costec = AV9Lb_costec.add(A891EscMCos) ;
         }
         /* Using cursor P09PF3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A910Workstat, Integer.valueOf(A887EscMLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPESCMAN");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = costecoloranteycostetotal.this.A396EmprCod;
      this.aP1[0] = costecoloranteycostetotal.this.A910Workstat;
      this.aP2[0] = costecoloranteycostetotal.this.AV8Coste_Cor;
      this.aP3[0] = costecoloranteycostetotal.this.AV9Lb_costec;
      Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.costecoloranteycostetotal");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Coste_Cor = DecimalUtil.ZERO ;
      AV9Lb_costec = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P09PF2_A396EmprCod = new String[] {""} ;
      P09PF2_A910Workstat = new String[] {""} ;
      P09PF2_A891EscMCos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09PF2_A719PrdNum = new String[] {""} ;
      P09PF2_A887EscMLin = new int[1] ;
      A891EscMCos = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.costecoloranteycostetotal__default(),
         new Object[] {
             new Object[] {
            P09PF2_A396EmprCod, P09PF2_A910Workstat, P09PF2_A891EscMCos, P09PF2_A719PrdNum, P09PF2_A887EscMLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10r ;
   private short Gx_err ;
   private int A887EscMLin ;
   private java.math.BigDecimal AV8Coste_Cor ;
   private java.math.BigDecimal AV9Lb_costec ;
   private java.math.BigDecimal A891EscMCos ;
   private String A396EmprCod ;
   private String A910Workstat ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private java.math.BigDecimal[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P09PF2_A396EmprCod ;
   private String[] P09PF2_A910Workstat ;
   private java.math.BigDecimal[] P09PF2_A891EscMCos ;
   private String[] P09PF2_A719PrdNum ;
   private int[] P09PF2_A887EscMLin ;
}

final  class costecoloranteycostetotal__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09PF2", "SELECT EmprCod, Workstat, EscMCos, PrdNum, EscMLin FROM TXPESCMAN WHERE EmprCod = ? and Workstat = ? ORDER BY EmprCod, Workstat, EscMLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P09PF3", "DELETE FROM TXPESCMAN  WHERE EmprCod = ? AND Workstat = ? AND EscMLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPESCMAN")
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

