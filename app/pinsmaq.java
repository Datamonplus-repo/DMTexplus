package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinsmaq extends GXProcedure
{
   public pinsmaq( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinsmaq.class ), "" );
   }

   public pinsmaq( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 )
   {
      pinsmaq.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             byte[] aP2 )
   {
      pinsmaq.this.AV8EmprCod = aP0[0];
      this.aP0 = aP0;
      pinsmaq.this.AV9CRCod = aP1[0];
      this.aP1 = aP1;
      pinsmaq.this.AV12Flag = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( AV12Flag == 1 )
      {
         /* Using cursor P02502 */
         pr_default.execute(0, new Object[] {AV8EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A620MaqTip = P02502_A620MaqTip[0] ;
            n620MaqTip = P02502_n620MaqTip[0] ;
            A396EmprCod = P02502_A396EmprCod[0] ;
            A606MaqDsc = P02502_A606MaqDsc[0] ;
            n606MaqDsc = P02502_n606MaqDsc[0] ;
            A602MaqCod = P02502_A602MaqCod[0] ;
            n602MaqCod = P02502_n602MaqCod[0] ;
            if ( GXutil.strcmp(A620MaqTip, httpContext.getMessage( "E", "")) == 0 )
            {
               W396EmprCod = A396EmprCod ;
               AV10MaqCod = A602MaqCod ;
               AV11Linea = (short)(AV11Linea+1) ;
               /*
                  INSERT RECORD ON TABLE TXPLCOSRE

               */
               W396EmprCod = A396EmprCod ;
               W602MaqCod = A602MaqCod ;
               n602MaqCod = false ;
               A396EmprCod = AV8EmprCod ;
               A6000CRCod = AV9CRCod ;
               A6005CRLin = AV11Linea ;
               A602MaqCod = AV10MaqCod ;
               n602MaqCod = false ;
               A6006CRCosPor = DecimalUtil.doubleToDec(0) ;
               n6006CRCosPor = false ;
               /* Using cursor P02503 */
               pr_default.execute(1, new Object[] {A396EmprCod, A6000CRCod, Short.valueOf(A6005CRLin), Boolean.valueOf(n602MaqCod), A602MaqCod, Boolean.valueOf(n6006CRCosPor), A6006CRCosPor});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLCOSRE");
               if ( (pr_default.getStatus(1) == 1) )
               {
                  Gx_err = (short)(1) ;
                  Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                  n6006CRCosPor = false ;
                  n602MaqCod = false ;
                  /* Optimized UPDATE. */
                  /* Using cursor P02504 */
                  pr_default.execute(2, new Object[] {Boolean.valueOf(n602MaqCod), AV10MaqCod, A396EmprCod, A6000CRCod, Short.valueOf(A6005CRLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLCOSRE");
                  /* End optimized UPDATE. */
               }
               else
               {
                  Gx_err = (short)(0) ;
                  Gx_emsg = "" ;
               }
               A396EmprCod = W396EmprCod ;
               A602MaqCod = W602MaqCod ;
               n602MaqCod = false ;
               /* End Insert */
               A396EmprCod = W396EmprCod ;
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
      }
      if ( AV12Flag == 2 )
      {
         /* Using cursor P02505 */
         pr_default.execute(3, new Object[] {AV8EmprCod, AV9CRCod});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A6000CRCod = P02505_A6000CRCod[0] ;
            A396EmprCod = P02505_A396EmprCod[0] ;
            A6005CRLin = P02505_A6005CRLin[0] ;
            AV13CrLin = A6005CRLin ;
            pr_default.readNext(3);
         }
         pr_default.close(3);
         n6004CRUltLin = false ;
         /* Optimized UPDATE. */
         /* Using cursor P02506 */
         short AV11Linea6004Aux;
         AV11Linea6004Aux = AV11Linea ;
         pr_default.execute(4, new Object[] {Boolean.valueOf(n6004CRUltLin), Short.valueOf(AV11Linea6004Aux), AV8EmprCod, AV9CRCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCOSRE");
         /* End optimized UPDATE. */
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pinsmaq.this.AV8EmprCod;
      this.aP1[0] = pinsmaq.this.AV9CRCod;
      this.aP2[0] = pinsmaq.this.AV12Flag;
      Application.commitDataStores(context, remoteHandle, pr_default, "pinsmaq");
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
      P02502_A620MaqTip = new String[] {""} ;
      P02502_n620MaqTip = new boolean[] {false} ;
      P02502_A396EmprCod = new String[] {""} ;
      P02502_A606MaqDsc = new String[] {""} ;
      P02502_n606MaqDsc = new boolean[] {false} ;
      P02502_A602MaqCod = new String[] {""} ;
      P02502_n602MaqCod = new boolean[] {false} ;
      A620MaqTip = "" ;
      A396EmprCod = "" ;
      A606MaqDsc = "" ;
      A602MaqCod = "" ;
      W396EmprCod = "" ;
      AV10MaqCod = "" ;
      W602MaqCod = "" ;
      A6000CRCod = "" ;
      A6006CRCosPor = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P02505_A6000CRCod = new String[] {""} ;
      P02505_A396EmprCod = new String[] {""} ;
      P02505_A6005CRLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pinsmaq__default(),
         new Object[] {
             new Object[] {
            P02502_A620MaqTip, P02502_n620MaqTip, P02502_A396EmprCod, P02502_A606MaqDsc, P02502_n606MaqDsc, P02502_A602MaqCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P02505_A6000CRCod, P02505_A396EmprCod, P02505_A6005CRLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12Flag ;
   private short AV11Linea ;
   private short A6005CRLin ;
   private short Gx_err ;
   private short AV13CrLin ;
   private short A6004CRUltLin ;
   private int GX_INS878 ;
   private java.math.BigDecimal A6006CRCosPor ;
   private String AV8EmprCod ;
   private String AV9CRCod ;
   private String scmdbuf ;
   private String A620MaqTip ;
   private String A396EmprCod ;
   private String A606MaqDsc ;
   private String A602MaqCod ;
   private String W396EmprCod ;
   private String AV10MaqCod ;
   private String W602MaqCod ;
   private String A6000CRCod ;
   private String Gx_emsg ;
   private boolean n620MaqTip ;
   private boolean n606MaqDsc ;
   private boolean n602MaqCod ;
   private boolean n6006CRCosPor ;
   private boolean n6004CRUltLin ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P02502_A620MaqTip ;
   private boolean[] P02502_n620MaqTip ;
   private String[] P02502_A396EmprCod ;
   private String[] P02502_A606MaqDsc ;
   private boolean[] P02502_n606MaqDsc ;
   private String[] P02502_A602MaqCod ;
   private boolean[] P02502_n602MaqCod ;
   private String[] P02505_A6000CRCod ;
   private String[] P02505_A396EmprCod ;
   private short[] P02505_A6005CRLin ;
}

final  class pinsmaq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02502", "SELECT MaqTip, EmprCod, MaqDsc, MaqCod FROM TXPMAQUIN WHERE EmprCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02503", "INSERT INTO TXPLCOSRE(EmprCod, CRCod, CRLin, MaqCod, CRCosPor) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLCOSRE")
         ,new UpdateCursor("P02504", "UPDATE TXPLCOSRE SET CRCosPor=0, MaqCod=?  WHERE EmprCod = ? and CRCod = ? and CRLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLCOSRE")
         ,new ForEachCursor("P02505", "SELECT CRCod, EmprCod, CRLin FROM TXPLCOSRE WHERE EmprCod = ? and CRCod = ? ORDER BY EmprCod, CRCod, CRLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02506", "UPDATE TXPCCOSRE SET CRUltLin=?  WHERE EmprCod = ? and CRCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCOSRE")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 15);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 15);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 6);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 2);
               }
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 15);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 15);
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 15);
               return;
      }
   }

}

