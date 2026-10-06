package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pgenmace extends GXProcedure
{
   public pgenmace( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgenmace.class ), "" );
   }

   public pgenmace( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             byte[] aP4 )
   {
      pgenmace.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 )
   {
      pgenmace.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pgenmace.this.AV16DisCod = aP1[0];
      this.aP1 = aP1;
      pgenmace.this.AV17MacCod = aP2[0];
      this.aP2 = aP2;
      pgenmace.this.AV20BARCOD = aP3[0];
      this.aP3 = aP3;
      pgenmace.this.AV21barcodreo = aP4[0];
      this.aP4 = aP4;
      pgenmace.this.AV22barcodpar = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18Linea = (short)(0) ;
      /*
         INSERT RECORD ON TABLE TXPCMACRO

      */
      A396EmprCod = AV15EmprCod ;
      A1199MacCod = AV17MacCod ;
      A1200MacUltLin = (short)(1) ;
      n1200MacUltLin = false ;
      AV18Linea = (short)(1) ;
      /* Using cursor P02JN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod), Boolean.valueOf(n1200MacUltLin), Short.valueOf(A1200MacUltLin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMACRO");
      if ( (pr_default.getStatus(0) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         /* Using cursor P02JN3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A396EmprCod = P02JN3_A396EmprCod[0] ;
            A1199MacCod = P02JN3_A1199MacCod[0] ;
            A1200MacUltLin = P02JN3_A1200MacUltLin[0] ;
            n1200MacUltLin = P02JN3_n1200MacUltLin[0] ;
            A1200MacUltLin = (short)(A1200MacUltLin+1) ;
            n1200MacUltLin = false ;
            AV18Linea = A1200MacUltLin ;
            /* Using cursor P02JN4 */
            pr_default.execute(2, new Object[] {Boolean.valueOf(n1200MacUltLin), Short.valueOf(A1200MacUltLin), A396EmprCod, Integer.valueOf(A1199MacCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMACRO");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      /*
         INSERT RECORD ON TABLE TXPLMACRO

      */
      A396EmprCod = AV15EmprCod ;
      A1199MacCod = AV17MacCod ;
      A1201MacLin = AV18Linea ;
      A1202MacDisCod = AV16DisCod ;
      A1203MacBarCod = AV20BARCOD ;
      A1204MacBarReo = AV21barcodreo ;
      A1205MacBarPar = AV22barcodpar ;
      /* Using cursor P02JN5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod), Short.valueOf(A1201MacLin), Integer.valueOf(A1202MacDisCod), Integer.valueOf(A1203MacBarCod), Byte.valueOf(A1204MacBarReo), A1205MacBarPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMACRO");
      if ( (pr_default.getStatus(3) == 1) )
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
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pgenmace.this.AV15EmprCod;
      this.aP1[0] = pgenmace.this.AV16DisCod;
      this.aP2[0] = pgenmace.this.AV17MacCod;
      this.aP3[0] = pgenmace.this.AV20BARCOD;
      this.aP4[0] = pgenmace.this.AV21barcodreo;
      this.aP5[0] = pgenmace.this.AV22barcodpar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pgenmace");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A396EmprCod = "" ;
      Gx_emsg = "" ;
      scmdbuf = "" ;
      P02JN3_A396EmprCod = new String[] {""} ;
      P02JN3_A1199MacCod = new int[1] ;
      P02JN3_A1200MacUltLin = new short[1] ;
      P02JN3_n1200MacUltLin = new boolean[] {false} ;
      A1205MacBarPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pgenmace__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P02JN3_A396EmprCod, P02JN3_A1199MacCod, P02JN3_A1200MacUltLin, P02JN3_n1200MacUltLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV21barcodreo ;
   private byte A1204MacBarReo ;
   private short AV18Linea ;
   private short A1200MacUltLin ;
   private short Gx_err ;
   private short A1201MacLin ;
   private int AV16DisCod ;
   private int AV17MacCod ;
   private int AV20BARCOD ;
   private int GX_INS167 ;
   private int A1199MacCod ;
   private int GX_INS168 ;
   private int A1202MacDisCod ;
   private int A1203MacBarCod ;
   private String AV15EmprCod ;
   private String AV22barcodpar ;
   private String A396EmprCod ;
   private String Gx_emsg ;
   private String scmdbuf ;
   private String A1205MacBarPar ;
   private boolean n1200MacUltLin ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private int[] aP3 ;
   private byte[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P02JN3_A396EmprCod ;
   private int[] P02JN3_A1199MacCod ;
   private short[] P02JN3_A1200MacUltLin ;
   private boolean[] P02JN3_n1200MacUltLin ;
}

final  class pgenmace__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P02JN2", "INSERT INTO TXPCMACRO(EmprCod, MacCod, MacUltLin) VALUES(?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCMACRO")
         ,new ForEachCursor("P02JN3", "SELECT EmprCod, MacCod, MacUltLin FROM TXPCMACRO WHERE EmprCod = ? and MacCod = ? ORDER BY EmprCod, MacCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02JN4", "UPDATE TXPCMACRO SET MacUltLin=?  WHERE EmprCod = ? AND MacCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCMACRO")
         ,new UpdateCursor("P02JN5", "INSERT INTO TXPLMACRO(EmprCod, MacCod, MacLin, MacDisCod, MacBarCod, MacBarReo, MacBarPar, MacKgs, MacMts) VALUES(?, ?, ?, ?, ?, ?, ?, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMACRO")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
      }
   }

}

