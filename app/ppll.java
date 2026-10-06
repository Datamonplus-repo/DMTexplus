package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppll extends GXProcedure
{
   public ppll( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppll.class ), "" );
   }

   public ppll( int remoteHandle ,
                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           short[] aP2 ,
                                           String[] aP3 ,
                                           String[] aP4 ,
                                           int[] aP5 )
   {
      ppll.this.aP6 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 ,
                        java.math.BigDecimal[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             java.math.BigDecimal[] aP6 )
   {
      ppll.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppll.this.A7434PLLNro = aP1[0];
      this.aP1 = aP1;
      ppll.this.A7443LPLNro = aP2[0];
      this.aP2 = aP2;
      ppll.this.AV9LPLArtCod = aP3[0];
      this.aP3 = aP3;
      ppll.this.A7445LPLColNom = aP4[0];
      this.aP4 = aP4;
      ppll.this.A7446LPLColNum = aP5[0];
      this.aP5 = aP5;
      ppll.this.AV8LPLCntPed = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02WR2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A7434PLLNro), Short.valueOf(A7443LPLNro), Boolean.valueOf(n7445LPLColNom), A7445LPLColNom, Boolean.valueOf(n7446LPLColNum), Integer.valueOf(A7446LPLColNum)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         /*
            INSERT RECORD ON TABLE TXPPLCLin

         */
         A7459CPLCom = (short)(999) ;
         A7460CPLArtCod = AV9LPLArtCod ;
         n7460CPLArtCod = false ;
         A7461CPLCntPed = AV8LPLCntPed ;
         n7461CPLCntPed = false ;
         A7466CPLAut = (byte)(1) ;
         n7466CPLAut = false ;
         A7467CPLCum = (byte)(0) ;
         n7467CPLCum = false ;
         /* Using cursor P02WR3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A7434PLLNro), Short.valueOf(A7443LPLNro), Short.valueOf(A7459CPLCom), Boolean.valueOf(n7460CPLArtCod), A7460CPLArtCod, Boolean.valueOf(n7461CPLCntPed), A7461CPLCntPed, Boolean.valueOf(n7466CPLAut), Byte.valueOf(A7466CPLAut), Boolean.valueOf(n7467CPLCum), Byte.valueOf(A7467CPLCum)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPLCLin");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            n7467CPLCum = false ;
            n7466CPLAut = false ;
            n7461CPLCntPed = false ;
            n7460CPLArtCod = false ;
            /* Optimized UPDATE. */
            /* Using cursor P02WR4 */
            pr_default.execute(2, new Object[] {Boolean.valueOf(n7461CPLCntPed), AV8LPLCntPed, Boolean.valueOf(n7460CPLArtCod), AV9LPLArtCod, A396EmprCod, Integer.valueOf(A7434PLLNro), Short.valueOf(A7443LPLNro)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPLCLin");
            /* End optimized UPDATE. */
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppll.this.A396EmprCod;
      this.aP1[0] = ppll.this.A7434PLLNro;
      this.aP2[0] = ppll.this.A7443LPLNro;
      this.aP3[0] = ppll.this.AV9LPLArtCod;
      this.aP4[0] = ppll.this.A7445LPLColNom;
      this.aP5[0] = ppll.this.A7446LPLColNum;
      this.aP6[0] = ppll.this.AV8LPLCntPed;
      Application.commitDataStores(context, remoteHandle, pr_default, "ppll");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P02WR2_A396EmprCod = new String[] {""} ;
      P02WR2_A7434PLLNro = new int[1] ;
      P02WR2_A7443LPLNro = new short[1] ;
      P02WR2_A7445LPLColNom = new String[] {""} ;
      P02WR2_n7445LPLColNom = new boolean[] {false} ;
      P02WR2_A7446LPLColNum = new int[1] ;
      P02WR2_n7446LPLColNum = new boolean[] {false} ;
      A7460CPLArtCod = "" ;
      A7461CPLCntPed = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppll__default(),
         new Object[] {
             new Object[] {
            P02WR2_A396EmprCod, P02WR2_A7434PLLNro, P02WR2_A7443LPLNro, P02WR2_A7445LPLColNom, P02WR2_n7445LPLColNom, P02WR2_A7446LPLColNum, P02WR2_n7446LPLColNum
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

   private byte A7466CPLAut ;
   private byte A7467CPLCum ;
   private short A7443LPLNro ;
   private short A7459CPLCom ;
   private short Gx_err ;
   private int A7434PLLNro ;
   private int A7446LPLColNum ;
   private int GX_INS1047 ;
   private java.math.BigDecimal AV8LPLCntPed ;
   private java.math.BigDecimal A7461CPLCntPed ;
   private String A396EmprCod ;
   private String AV9LPLArtCod ;
   private String A7445LPLColNom ;
   private String scmdbuf ;
   private String A7460CPLArtCod ;
   private String Gx_emsg ;
   private boolean n7445LPLColNom ;
   private boolean n7446LPLColNum ;
   private boolean n7460CPLArtCod ;
   private boolean n7461CPLCntPed ;
   private boolean n7466CPLAut ;
   private boolean n7467CPLCum ;
   private java.math.BigDecimal[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private int[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P02WR2_A396EmprCod ;
   private int[] P02WR2_A7434PLLNro ;
   private short[] P02WR2_A7443LPLNro ;
   private String[] P02WR2_A7445LPLColNom ;
   private boolean[] P02WR2_n7445LPLColNom ;
   private int[] P02WR2_A7446LPLColNum ;
   private boolean[] P02WR2_n7446LPLColNum ;
}

final  class ppll__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02WR2", "SELECT EmprCod, PLLNro, LPLNro, LPLColNom, LPLColNum FROM TXPPLLLin WHERE (EmprCod = ? and PLLNro = ? and LPLNro = ?) AND (LPLColNom = ?) AND (LPLColNum = ?) ORDER BY EmprCod, PLLNro, LPLNro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02WR3", "INSERT INTO TXPPLCLin(EmprCod, PLLNro, LPLNro, CPLCom, CPLArtCod, CPLCntPed, CPLAut, CPLCum) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPLCLin")
         ,new UpdateCursor("P02WR4", "UPDATE TXPPLCLin SET CPLCum=0, CPLAut=1, CPLCntPed=?, CPLArtCod=?  WHERE EmprCod = ? and PLLNro = ? and LPLNro = ? and CPLCom = 999", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPLCLin")
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 13);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[6]).intValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 16);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[7], 3);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[11]).byteValue());
               }
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 16);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setShort(5, ((Number) parms[6]).shortValue());
               return;
      }
   }

}

