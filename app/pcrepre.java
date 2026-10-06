package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcrepre extends GXProcedure
{
   public pcrepre( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcrepre.class ), "" );
   }

   public pcrepre( int remoteHandle ,
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
                             java.math.BigDecimal[] aP5 )
   {
      pcrepre.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             String[] aP6 )
   {
      pcrepre.this.AV15EmprCod = aP0;
      pcrepre.this.AV16PrvNum = aP1;
      pcrepre.this.AV17PrdNum = aP2;
      pcrepre.this.AV18Unidades = aP3[0];
      this.aP3 = aP3;
      pcrepre.this.AV19Precio = aP4[0];
      this.aP4 = aP4;
      pcrepre.this.AV20Dto = aP5[0];
      this.aP5 = aP5;
      pcrepre.this.AV21Prior = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV22Preped = (byte)(0) ;
      /* Using cursor P001D2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16PrvNum), AV17PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P001D2_A719PrdNum[0] ;
         A756PrePrvNum = P001D2_A756PrePrvNum[0] ;
         A396EmprCod = P001D2_A396EmprCod[0] ;
         A753PrePedPre = P001D2_A753PrePedPre[0] ;
         n753PrePedPre = P001D2_n753PrePedPre[0] ;
         A755PrePedUni = P001D2_A755PrePedUni[0] ;
         n755PrePedUni = P001D2_n755PrePedUni[0] ;
         A754PrePedPri = P001D2_A754PrePedPri[0] ;
         n754PrePedPri = P001D2_n754PrePedPri[0] ;
         A752PrePedDto = P001D2_A752PrePedDto[0] ;
         n752PrePedDto = P001D2_n752PrePedDto[0] ;
         A751PrePedCon = P001D2_A751PrePedCon[0] ;
         n751PrePedCon = P001D2_n751PrePedCon[0] ;
         A658PedCod = P001D2_A658PedCod[0] ;
         n658PedCod = P001D2_n658PedCod[0] ;
         A753PrePedPre = AV19Precio ;
         n753PrePedPre = false ;
         A755PrePedUni = AV18Unidades ;
         n755PrePedUni = false ;
         A754PrePedPri = AV21Prior ;
         n754PrePedPri = false ;
         A752PrePedDto = AV20Dto ;
         n752PrePedDto = false ;
         A753PrePedPre = AV19Precio ;
         n753PrePedPre = false ;
         A751PrePedCon = httpContext.getMessage( "S", "") ;
         n751PrePedCon = false ;
         A658PedCod = 0 ;
         n658PedCod = false ;
         AV22Preped = (byte)(1) ;
         /* Using cursor P001D3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n753PrePedPre), A753PrePedPre, Boolean.valueOf(n755PrePedUni), A755PrePedUni, Boolean.valueOf(n754PrePedPri), A754PrePedPri, Boolean.valueOf(n752PrePedDto), A752PrePedDto, Boolean.valueOf(n751PrePedCon), A751PrePedCon, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A396EmprCod, Integer.valueOf(A756PrePrvNum), A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREPED");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV22Preped == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPPREPED

         */
         A396EmprCod = AV15EmprCod ;
         A756PrePrvNum = AV16PrvNum ;
         A719PrdNum = AV17PrdNum ;
         A658PedCod = 0 ;
         n658PedCod = false ;
         A755PrePedUni = AV18Unidades ;
         n755PrePedUni = false ;
         A751PrePedCon = httpContext.getMessage( "S", "") ;
         n751PrePedCon = false ;
         A753PrePedPre = AV19Precio ;
         n753PrePedPre = false ;
         A752PrePedDto = AV20Dto ;
         n752PrePedDto = false ;
         A754PrePedPri = AV21Prior ;
         n754PrePedPri = false ;
         /* Using cursor P001D4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A756PrePrvNum), A719PrdNum, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), Boolean.valueOf(n755PrePedUni), A755PrePedUni, Boolean.valueOf(n751PrePedCon), A751PrePedCon, Boolean.valueOf(n753PrePedPre), A753PrePedPre, Boolean.valueOf(n752PrePedDto), A752PrePedDto, Boolean.valueOf(n754PrePedPri), A754PrePedPri});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREPED");
         if ( (pr_default.getStatus(2) == 1) )
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
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = pcrepre.this.AV18Unidades;
      this.aP4[0] = pcrepre.this.AV19Precio;
      this.aP5[0] = pcrepre.this.AV20Dto;
      this.aP6[0] = pcrepre.this.AV21Prior;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcrepre");
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
      P001D2_A719PrdNum = new String[] {""} ;
      P001D2_A756PrePrvNum = new int[1] ;
      P001D2_A396EmprCod = new String[] {""} ;
      P001D2_A753PrePedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001D2_n753PrePedPre = new boolean[] {false} ;
      P001D2_A755PrePedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001D2_n755PrePedUni = new boolean[] {false} ;
      P001D2_A754PrePedPri = new String[] {""} ;
      P001D2_n754PrePedPri = new boolean[] {false} ;
      P001D2_A752PrePedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001D2_n752PrePedDto = new boolean[] {false} ;
      P001D2_A751PrePedCon = new String[] {""} ;
      P001D2_n751PrePedCon = new boolean[] {false} ;
      P001D2_A658PedCod = new int[1] ;
      P001D2_n658PedCod = new boolean[] {false} ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      A753PrePedPre = DecimalUtil.ZERO ;
      A755PrePedUni = DecimalUtil.ZERO ;
      A754PrePedPri = "" ;
      A752PrePedDto = DecimalUtil.ZERO ;
      A751PrePedCon = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcrepre__default(),
         new Object[] {
             new Object[] {
            P001D2_A719PrdNum, P001D2_A756PrePrvNum, P001D2_A396EmprCod, P001D2_A753PrePedPre, P001D2_n753PrePedPre, P001D2_A755PrePedUni, P001D2_n755PrePedUni, P001D2_A754PrePedPri, P001D2_n754PrePedPri, P001D2_A752PrePedDto,
            P001D2_n752PrePedDto, P001D2_A751PrePedCon, P001D2_n751PrePedCon, P001D2_A658PedCod, P001D2_n658PedCod
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

   private byte AV22Preped ;
   private short Gx_err ;
   private int AV16PrvNum ;
   private int A756PrePrvNum ;
   private int A658PedCod ;
   private int GX_INS86 ;
   private java.math.BigDecimal AV18Unidades ;
   private java.math.BigDecimal AV19Precio ;
   private java.math.BigDecimal AV20Dto ;
   private java.math.BigDecimal A753PrePedPre ;
   private java.math.BigDecimal A755PrePedUni ;
   private java.math.BigDecimal A752PrePedDto ;
   private String AV15EmprCod ;
   private String AV17PrdNum ;
   private String AV21Prior ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String A754PrePedPri ;
   private String A751PrePedCon ;
   private String Gx_emsg ;
   private boolean n753PrePedPre ;
   private boolean n755PrePedUni ;
   private boolean n754PrePedPri ;
   private boolean n752PrePedDto ;
   private boolean n751PrePedCon ;
   private boolean n658PedCod ;
   private String[] aP6 ;
   private java.math.BigDecimal[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P001D2_A719PrdNum ;
   private int[] P001D2_A756PrePrvNum ;
   private String[] P001D2_A396EmprCod ;
   private java.math.BigDecimal[] P001D2_A753PrePedPre ;
   private boolean[] P001D2_n753PrePedPre ;
   private java.math.BigDecimal[] P001D2_A755PrePedUni ;
   private boolean[] P001D2_n755PrePedUni ;
   private String[] P001D2_A754PrePedPri ;
   private boolean[] P001D2_n754PrePedPri ;
   private java.math.BigDecimal[] P001D2_A752PrePedDto ;
   private boolean[] P001D2_n752PrePedDto ;
   private String[] P001D2_A751PrePedCon ;
   private boolean[] P001D2_n751PrePedCon ;
   private int[] P001D2_A658PedCod ;
   private boolean[] P001D2_n658PedCod ;
}

final  class pcrepre__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001D2", "SELECT PrdNum, PrePrvNum, EmprCod, PrePedPre, PrePedUni, PrePedPri, PrePedDto, PrePedCon, PedCod FROM TXPPREPED WHERE EmprCod = ? and PrePrvNum = ? and PrdNum = ? ORDER BY EmprCod, PrePrvNum, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P001D3", "UPDATE TXPPREPED SET PrePedPre=?, PrePedUni=?, PrePedPri=?, PrePedDto=?, PrePedCon=?, PedCod=?  WHERE EmprCod = ? AND PrePrvNum = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPREPED")
         ,new UpdateCursor("P001D4", "INSERT INTO TXPPREPED(EmprCod, PrePrvNum, PrdNum, PedCod, PrePedUni, PrePedCon, PrePedPre, PrePedDto, PrePedPri) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPREPED")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 5);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 1);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[11]).intValue());
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setInt(8, ((Number) parms[13]).intValue());
               stmt.setString(9, (String)parms[14], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[10], 5);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[14], 1);
               }
               return;
      }
   }

}

