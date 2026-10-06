package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdoc000 extends GXProcedure
{
   public pdoc000( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdoc000.class ), "" );
   }

   public pdoc000( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             byte[] aP2 ,
                             java.util.Date[] aP3 ,
                             int[] aP4 ,
                             java.util.Date[] aP5 )
   {
      pdoc000.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        byte[] aP2 ,
                        java.util.Date[] aP3 ,
                        int[] aP4 ,
                        java.util.Date[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             byte[] aP2 ,
                             java.util.Date[] aP3 ,
                             int[] aP4 ,
                             java.util.Date[] aP5 ,
                             String[] aP6 )
   {
      pdoc000.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdoc000.this.AV16Pri = aP1[0];
      this.aP1 = aP1;
      pdoc000.this.AV17TipoDoc = aP2[0];
      this.aP2 = aP2;
      pdoc000.this.AV18Fch = aP3[0];
      this.aP3 = aP3;
      pdoc000.this.AV19AlbLast = aP4[0];
      this.aP4 = aP4;
      pdoc000.this.AV20FchCtrl = aP5[0];
      this.aP5 = aP5;
      pdoc000.this.Gx_msg = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = " " ;
      AV19AlbLast = 0 ;
      AV18Fch = GXutil.nullDate() ;
      if ( AV17TipoDoc == 1 )
      {
         /* Using cursor P042P2 */
         pr_default.execute(0, new Object[] {A396EmprCod, AV16Pri});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A39AlbProPri = P042P2_A39AlbProPri[0] ;
            A34AlbProfch = P042P2_A34AlbProfch[0] ;
            A30AlbProCod = P042P2_A30AlbProCod[0] ;
            if ( GXutil.year( A34AlbProfch) == GXutil.year( GXutil.today( )) )
            {
               AV18Fch = A34AlbProfch ;
               AV19AlbLast = (int)(A30AlbProCod) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
         if ( GXutil.resetTime(AV20FchCtrl).before( GXutil.resetTime( AV18Fch )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV18Fch)) )
         {
            Gx_msg = httpContext.getMessage( "A data de entrada ", "") + localUtil.dtoc( AV20FchCtrl, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + GXutil.chr( (short)(13)) ;
            Gx_msg += httpContext.getMessage( "é menor do que a última data ", "") + localUtil.dtoc( AV18Fch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
      }
      else if ( AV17TipoDoc == 2 )
      {
         /* Using cursor P042P3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV16Pri});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A22AlbComPri = P042P3_A22AlbComPri[0] ;
            A17AlbComFch = P042P3_A17AlbComFch[0] ;
            A14AlbComCod = P042P3_A14AlbComCod[0] ;
            if ( GXutil.year( A17AlbComFch) == GXutil.year( GXutil.today( )) )
            {
               AV18Fch = A17AlbComFch ;
               AV19AlbLast = A14AlbComCod ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( GXutil.resetTime(AV20FchCtrl).before( GXutil.resetTime( AV18Fch )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV18Fch)) )
         {
            Gx_msg = httpContext.getMessage( "A data de entrada ", "") + localUtil.dtoc( AV20FchCtrl, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + GXutil.chr( (short)(13)) ;
            Gx_msg += httpContext.getMessage( "é menor do que a última data ", "") + localUtil.dtoc( AV18Fch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
      }
      else if ( AV17TipoDoc == 3 )
      {
         /* Using cursor P042P4 */
         pr_default.execute(2, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A13430AlbProDate = P042P4_A13430AlbProDate[0] ;
            A13418AlbProID = P042P4_A13418AlbProID[0] ;
            if ( GXutil.year( A13430AlbProDate) == GXutil.year( GXutil.today( )) )
            {
               AV18Fch = A13430AlbProDate ;
               AV19AlbLast = A13418AlbProID ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(2);
         }
         pr_default.close(2);
         if ( GXutil.resetTime(AV20FchCtrl).before( GXutil.resetTime( AV18Fch )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV18Fch)) )
         {
            Gx_msg = httpContext.getMessage( "A data de entrada ", "") + localUtil.dtoc( AV20FchCtrl, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + GXutil.chr( (short)(13)) ;
            Gx_msg += httpContext.getMessage( "é menor do que a última data ", "") + localUtil.dtoc( AV18Fch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdoc000.this.A396EmprCod;
      this.aP1[0] = pdoc000.this.AV16Pri;
      this.aP2[0] = pdoc000.this.AV17TipoDoc;
      this.aP3[0] = pdoc000.this.AV18Fch;
      this.aP4[0] = pdoc000.this.AV19AlbLast;
      this.aP5[0] = pdoc000.this.AV20FchCtrl;
      this.aP6[0] = pdoc000.this.Gx_msg;
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
      P042P2_A396EmprCod = new String[] {""} ;
      P042P2_A39AlbProPri = new String[] {""} ;
      P042P2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P042P2_A30AlbProCod = new long[1] ;
      A39AlbProPri = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      P042P3_A396EmprCod = new String[] {""} ;
      P042P3_A22AlbComPri = new String[] {""} ;
      P042P3_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P042P3_A14AlbComCod = new int[1] ;
      A22AlbComPri = "" ;
      A17AlbComFch = GXutil.nullDate() ;
      P042P4_A396EmprCod = new String[] {""} ;
      P042P4_A13430AlbProDate = new java.util.Date[] {GXutil.nullDate()} ;
      P042P4_A13418AlbProID = new int[1] ;
      A13430AlbProDate = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdoc000__default(),
         new Object[] {
             new Object[] {
            P042P2_A396EmprCod, P042P2_A39AlbProPri, P042P2_A34AlbProfch, P042P2_A30AlbProCod
            }
            , new Object[] {
            P042P3_A396EmprCod, P042P3_A22AlbComPri, P042P3_A17AlbComFch, P042P3_A14AlbComCod
            }
            , new Object[] {
            P042P4_A396EmprCod, P042P4_A13430AlbProDate, P042P4_A13418AlbProID
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17TipoDoc ;
   private short Gx_err ;
   private int AV19AlbLast ;
   private int A14AlbComCod ;
   private int A13418AlbProID ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String AV16Pri ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A39AlbProPri ;
   private String A22AlbComPri ;
   private java.util.Date AV18Fch ;
   private java.util.Date AV20FchCtrl ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date A17AlbComFch ;
   private java.util.Date A13430AlbProDate ;
   private String[] aP6 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private byte[] aP2 ;
   private java.util.Date[] aP3 ;
   private int[] aP4 ;
   private java.util.Date[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P042P2_A396EmprCod ;
   private String[] P042P2_A39AlbProPri ;
   private java.util.Date[] P042P2_A34AlbProfch ;
   private long[] P042P2_A30AlbProCod ;
   private String[] P042P3_A396EmprCod ;
   private String[] P042P3_A22AlbComPri ;
   private java.util.Date[] P042P3_A17AlbComFch ;
   private int[] P042P3_A14AlbComCod ;
   private String[] P042P4_A396EmprCod ;
   private java.util.Date[] P042P4_A13430AlbProDate ;
   private int[] P042P4_A13418AlbProID ;
}

final  class pdoc000__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P042P2", "SELECT EmprCod, AlbProPri, AlbProfch, AlbProCod FROM TXPCALPRD WHERE (EmprCod = ?) AND (AlbProPri = ?) ORDER BY EmprCod, AlbProCod DESC, AlbProfch ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P042P3", "SELECT EmprCod, AlbComPri, AlbComFch, AlbComCod FROM TXPCALCOM WHERE (EmprCod = ?) AND (AlbComPri = ?) ORDER BY EmprCod, AlbComCod DESC, AlbComFch ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P042P4", "SELECT EmprCod, AlbProDate, AlbProID FROM TXPCALPRO WHERE EmprCod = ? ORDER BY EmprCod, AlbProID DESC, AlbProDate ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setString(2, (String)parms[1], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

