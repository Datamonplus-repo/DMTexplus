package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pponpas extends GXProcedure
{
   public pponpas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pponpas.class ), "" );
   }

   public pponpas( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     int[] aP1 ,
                                     byte[] aP2 ,
                                     String[] aP3 ,
                                     byte[] aP4 ,
                                     String[] aP5 )
   {
      pponpas.this.aP6 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 ,
                        java.util.Date[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             java.util.Date[] aP6 )
   {
      pponpas.this.AV16EmprCod = aP0[0];
      this.aP0 = aP0;
      pponpas.this.AV17barcod = aP1[0];
      this.aP1 = aP1;
      pponpas.this.AV18barcodreo = aP2[0];
      this.aP2 = aP2;
      pponpas.this.AV19barcodpar = aP3[0];
      this.aP3 = aP3;
      pponpas.this.AV15pasa = aP4[0];
      this.aP4 = aP4;
      pponpas.this.AV20maqcod = aP5[0];
      this.aP5 = aP5;
      pponpas.this.AV23BarFecLan = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      n1003BarFecLan = false ;
      n2401BarNumPas = false ;
      /* Optimized UPDATE. */
      /* Using cursor P00EM2 */
      pr_default.execute(0, new Object[] {Byte.valueOf(AV15pasa), Boolean.valueOf(n1003BarFecLan), AV23BarFecLan, AV20maqcod, Boolean.valueOf(n2401BarNumPas), Byte.valueOf(AV15pasa), AV16EmprCod, Integer.valueOf(AV17barcod), Byte.valueOf(AV18barcodreo), AV19barcodpar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pponpas.this.AV16EmprCod;
      this.aP1[0] = pponpas.this.AV17barcod;
      this.aP2[0] = pponpas.this.AV18barcodreo;
      this.aP3[0] = pponpas.this.AV19barcodpar;
      this.aP4[0] = pponpas.this.AV15pasa;
      this.aP5[0] = pponpas.this.AV20maqcod;
      this.aP6[0] = pponpas.this.AV23BarFecLan;
      Application.commitDataStores(context, remoteHandle, pr_default, "pponpas");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A1003BarFecLan = GXutil.nullDate() ;
      A180BarMaqCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pponpas__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18barcodreo ;
   private byte AV15pasa ;
   private byte A3594BarPriTin ;
   private byte A2401BarNumPas ;
   private short Gx_err ;
   private int AV17barcod ;
   private String AV16EmprCod ;
   private String AV19barcodpar ;
   private String AV20maqcod ;
   private String A180BarMaqCod ;
   private java.util.Date AV23BarFecLan ;
   private java.util.Date A1003BarFecLan ;
   private boolean n1003BarFecLan ;
   private boolean n2401BarNumPas ;
   private java.util.Date[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
}

final  class pponpas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00EM2", "UPDATE TXPBARCAD SET BarPriTin=?, BarFecLan=?, BarMaqCod=?, BarNumPas=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DATE );
               }
               else
               {
                  stmt.setDate(2, (java.util.Date)parms[2]);
               }
               stmt.setString(3, (String)parms[3], 6);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[5]).byteValue());
               }
               stmt.setString(5, (String)parms[6], 3);
               stmt.setInt(6, ((Number) parms[7]).intValue());
               stmt.setByte(7, ((Number) parms[8]).byteValue());
               stmt.setString(8, (String)parms[9], 1);
               return;
      }
   }

}

