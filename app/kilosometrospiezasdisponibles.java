package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class kilosometrospiezasdisponibles extends GXProcedure
{
   public kilosometrospiezasdisponibles( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( kilosometrospiezasdisponibles.class ), "" );
   }

   public kilosometrospiezasdisponibles( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 ,
                          int aP1 ,
                          String aP2 ,
                          java.math.BigDecimal[] aP3 ,
                          java.math.BigDecimal[] aP4 )
   {
      kilosometrospiezasdisponibles.this.aP5 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        int[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             int[] aP5 )
   {
      kilosometrospiezasdisponibles.this.A396EmprCod = aP0;
      kilosometrospiezasdisponibles.this.A44AlbRecCod = aP1;
      kilosometrospiezasdisponibles.this.AV17AlbRUni = aP2;
      kilosometrospiezasdisponibles.this.aP3 = aP3;
      kilosometrospiezasdisponibles.this.aP4 = aP4;
      kilosometrospiezasdisponibles.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18kilos = DecimalUtil.ZERO ;
      AV19metros = DecimalUtil.ZERO ;
      AV20piezas = 0 ;
      /* Using cursor P09XO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A54AlbRPieUti = P09XO2_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P09XO2_A52AlbRPieEnt[0] ;
         A60AlbRUniUti = P09XO2_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P09XO2_A58AlbRUniEnt[0] ;
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
         }
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         AV18kilos = ((GXutil.strcmp(AV17AlbRUni, "K")==0) ? A57AlbRUniDis : DecimalUtil.doubleToDec(0)) ;
         AV19metros = ((GXutil.strcmp(AV17AlbRUni, "M")==0) ? A57AlbRUniDis : DecimalUtil.doubleToDec(0)) ;
         AV20piezas = A51AlbRPieDis ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = kilosometrospiezasdisponibles.this.AV18kilos;
      this.aP4[0] = kilosometrospiezasdisponibles.this.AV19metros;
      this.aP5[0] = kilosometrospiezasdisponibles.this.AV20piezas;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18kilos = DecimalUtil.ZERO ;
      AV19metros = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P09XO2_A396EmprCod = new String[] {""} ;
      P09XO2_A44AlbRecCod = new int[1] ;
      P09XO2_A54AlbRPieUti = new int[1] ;
      P09XO2_A52AlbRPieEnt = new int[1] ;
      P09XO2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09XO2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.kilosometrospiezasdisponibles__default(),
         new Object[] {
             new Object[] {
            P09XO2_A396EmprCod, P09XO2_A44AlbRecCod, P09XO2_A54AlbRPieUti, P09XO2_A52AlbRPieEnt, P09XO2_A60AlbRUniUti, P09XO2_A58AlbRUniEnt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A44AlbRecCod ;
   private int AV20piezas ;
   private int A54AlbRPieUti ;
   private int A52AlbRPieEnt ;
   private int A51AlbRPieDis ;
   private java.math.BigDecimal AV18kilos ;
   private java.math.BigDecimal AV19metros ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private String A396EmprCod ;
   private String AV17AlbRUni ;
   private String scmdbuf ;
   private int[] aP5 ;
   private java.math.BigDecimal[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09XO2_A396EmprCod ;
   private int[] P09XO2_A44AlbRecCod ;
   private int[] P09XO2_A54AlbRPieUti ;
   private int[] P09XO2_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P09XO2_A60AlbRUniUti ;
   private java.math.BigDecimal[] P09XO2_A58AlbRUniEnt ;
}

final  class kilosometrospiezasdisponibles__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09XO2", "SELECT EmprCod, AlbRecCod, AlbRPieUti, AlbRPieEnt, AlbRUniUti, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
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
      }
   }

}

