package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class unidadespiezasdisponibles extends GXProcedure
{
   public unidadespiezasdisponibles( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( unidadespiezasdisponibles.class ), "" );
   }

   public unidadespiezasdisponibles( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             int[] aP5 )
   {
      unidadespiezasdisponibles.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        int[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             int[] aP5 ,
                             String[] aP6 )
   {
      unidadespiezasdisponibles.this.AV8Emprcod = aP0;
      unidadespiezasdisponibles.this.AV9Albreccod = aP1;
      unidadespiezasdisponibles.this.AV14AlbrUni = aP2;
      unidadespiezasdisponibles.this.aP3 = aP3;
      unidadespiezasdisponibles.this.aP4 = aP4;
      unidadespiezasdisponibles.this.aP5 = aP5;
      unidadespiezasdisponibles.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13Errmessages = "" ;
      AV10Kilos = DecimalUtil.ZERO ;
      AV11Metros = DecimalUtil.ZERO ;
      AV12Piezas = 0 ;
      AV17GXLvl5 = (byte)(0) ;
      /* Using cursor P09252 */
      pr_default.execute(0, new Object[] {AV8Emprcod, Integer.valueOf(AV9Albreccod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A44AlbRecCod = P09252_A44AlbRecCod[0] ;
         A396EmprCod = P09252_A396EmprCod[0] ;
         A54AlbRPieUti = P09252_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P09252_A52AlbRPieEnt[0] ;
         A60AlbRUniUti = P09252_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P09252_A58AlbRUniEnt[0] ;
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
         AV17GXLvl5 = (byte)(1) ;
         AV10Kilos = ((GXutil.strcmp(AV14AlbrUni, "K")==0) ? A57AlbRUniDis : DecimalUtil.doubleToDec(0)) ;
         AV11Metros = ((GXutil.strcmp(AV14AlbrUni, "M")==0) ? A57AlbRUniDis : DecimalUtil.doubleToDec(0)) ;
         AV12Piezas = A51AlbRPieDis ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV17GXLvl5 == 0 )
      {
         AV13Errmessages = httpContext.getMessage( "NO existe el Nº Recepcion introducido", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = unidadespiezasdisponibles.this.AV10Kilos;
      this.aP4[0] = unidadespiezasdisponibles.this.AV11Metros;
      this.aP5[0] = unidadespiezasdisponibles.this.AV12Piezas;
      this.aP6[0] = unidadespiezasdisponibles.this.AV13Errmessages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Kilos = DecimalUtil.ZERO ;
      AV11Metros = DecimalUtil.ZERO ;
      AV13Errmessages = "" ;
      scmdbuf = "" ;
      P09252_A44AlbRecCod = new int[1] ;
      P09252_A396EmprCod = new String[] {""} ;
      P09252_A54AlbRPieUti = new int[1] ;
      P09252_A52AlbRPieEnt = new int[1] ;
      P09252_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09252_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A396EmprCod = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.unidadespiezasdisponibles__default(),
         new Object[] {
             new Object[] {
            P09252_A44AlbRecCod, P09252_A396EmprCod, P09252_A54AlbRPieUti, P09252_A52AlbRPieEnt, P09252_A60AlbRUniUti, P09252_A58AlbRUniEnt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17GXLvl5 ;
   private short Gx_err ;
   private int AV9Albreccod ;
   private int AV12Piezas ;
   private int A44AlbRecCod ;
   private int A54AlbRPieUti ;
   private int A52AlbRPieEnt ;
   private int A51AlbRPieDis ;
   private java.math.BigDecimal AV10Kilos ;
   private java.math.BigDecimal AV11Metros ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private String AV8Emprcod ;
   private String AV14AlbrUni ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String AV13Errmessages ;
   private String[] aP6 ;
   private java.math.BigDecimal[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private int[] aP5 ;
   private IDataStoreProvider pr_default ;
   private int[] P09252_A44AlbRecCod ;
   private String[] P09252_A396EmprCod ;
   private int[] P09252_A54AlbRPieUti ;
   private int[] P09252_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P09252_A60AlbRUniUti ;
   private java.math.BigDecimal[] P09252_A58AlbRUniEnt ;
}

final  class unidadespiezasdisponibles__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09252", "SELECT AlbRecCod, EmprCod, AlbRPieUti, AlbRPieEnt, AlbRUniUti, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
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

