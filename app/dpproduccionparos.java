package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpproduccionparos extends GXProcedure
{
   public dpproduccionparos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpproduccionparos.class ), "" );
   }

   public dpproduccionparos( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTProduccionParos> executeUdp( String aP0 ,
                                                                  String aP1 ,
                                                                  String aP2 ,
                                                                  java.util.Date aP3 ,
                                                                  java.util.Date aP4 )
   {
      dpproduccionparos.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTProduccionParos>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        GXBaseCollection<app.SdtSDTProduccionParos>[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             GXBaseCollection<app.SdtSDTProduccionParos>[] aP5 )
   {
      dpproduccionparos.this.AV9Emprcod = aP0;
      dpproduccionparos.this.AV8MaqCodInicial = aP1;
      dpproduccionparos.this.AV7MaqCodFinal = aP2;
      dpproduccionparos.this.AV6Hisprodti = aP3;
      dpproduccionparos.this.AV5HisProdtf = aP4;
      dpproduccionparos.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P001B2 */
      pr_default.execute(0, new Object[] {AV9Emprcod, AV8MaqCodInicial, AV6Hisprodti, AV5HisProdtf, AV7MaqCodFinal});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P001B2_A396EmprCod[0] ;
         A656ParCod = P001B2_A656ParCod[0] ;
         n656ParCod = P001B2_n656ParCod[0] ;
         A602MaqCod = P001B2_A602MaqCod[0] ;
         A606MaqDsc = P001B2_A606MaqDsc[0] ;
         n606MaqDsc = P001B2_n606MaqDsc[0] ;
         A867ParCodNom = P001B2_A867ParCodNom[0] ;
         n867ParCodNom = P001B2_n867ParCodNom[0] ;
         A4440HisProDTI = P001B2_A4440HisProDTI[0] ;
         n4440HisProDTI = P001B2_n4440HisProDTI[0] ;
         A4441HisProDTF = P001B2_A4441HisProDTF[0] ;
         n4441HisProDTF = P001B2_n4441HisProDTF[0] ;
         A558HisProFec = P001B2_A558HisProFec[0] ;
         A561HisProLin = P001B2_A561HisProLin[0] ;
         A867ParCodNom = P001B2_A867ParCodNom[0] ;
         n867ParCodNom = P001B2_n867ParCodNom[0] ;
         A606MaqDsc = P001B2_A606MaqDsc[0] ;
         n606MaqDsc = P001B2_n606MaqDsc[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         Gxm1sdtproduccionparos = (app.SdtSDTProduccionParos)new app.SdtSDTProduccionParos(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtproduccionparos, 0);
         Gxm1sdtproduccionparos.setgxTv_SdtSDTProduccionParos_Maqcod( A602MaqCod );
         Gxm1sdtproduccionparos.setgxTv_SdtSDTProduccionParos_Maqdsc( A606MaqDsc );
         Gxm1sdtproduccionparos.setgxTv_SdtSDTProduccionParos_Parcod( A656ParCod );
         Gxm1sdtproduccionparos.setgxTv_SdtSDTProduccionParos_Parcodnom( A867ParCodNom );
         Gxm1sdtproduccionparos.setgxTv_SdtSDTProduccionParos_Hisprodti( A4440HisProDTI );
         Gxm1sdtproduccionparos.setgxTv_SdtSDTProduccionParos_Hisprodtf( A4441HisProDTF );
         Gxm1sdtproduccionparos.setgxTv_SdtSDTProduccionParos_Tiempoparo( A5605HisProTr2 );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = dpproduccionparos.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTProduccionParos>(app.SdtSDTProduccionParos.class, "SDTProduccionParos", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P001B2_A396EmprCod = new String[] {""} ;
      P001B2_A656ParCod = new short[1] ;
      P001B2_n656ParCod = new boolean[] {false} ;
      P001B2_A602MaqCod = new String[] {""} ;
      P001B2_A606MaqDsc = new String[] {""} ;
      P001B2_n606MaqDsc = new boolean[] {false} ;
      P001B2_A867ParCodNom = new String[] {""} ;
      P001B2_n867ParCodNom = new boolean[] {false} ;
      P001B2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P001B2_n4440HisProDTI = new boolean[] {false} ;
      P001B2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P001B2_n4441HisProDTF = new boolean[] {false} ;
      P001B2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P001B2_A561HisProLin = new int[1] ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      A867ParCodNom = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A558HisProFec = GXutil.nullDate() ;
      Gxm1sdtproduccionparos = new app.SdtSDTProduccionParos(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dpproduccionparos__default(),
         new Object[] {
             new Object[] {
            P001B2_A396EmprCod, P001B2_A656ParCod, P001B2_n656ParCod, P001B2_A602MaqCod, P001B2_A606MaqDsc, P001B2_n606MaqDsc, P001B2_A867ParCodNom, P001B2_n867ParCodNom, P001B2_A4440HisProDTI, P001B2_n4440HisProDTI,
            P001B2_A4441HisProDTF, P001B2_n4441HisProDTF, P001B2_A558HisProFec, P001B2_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A656ParCod ;
   private short A5605HisProTr2 ;
   private short Gx_err ;
   private int A561HisProLin ;
   private String AV9Emprcod ;
   private String AV8MaqCodInicial ;
   private String AV7MaqCodFinal ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String A867ParCodNom ;
   private java.util.Date AV6Hisprodti ;
   private java.util.Date AV5HisProdtf ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A558HisProFec ;
   private boolean n656ParCod ;
   private boolean n606MaqDsc ;
   private boolean n867ParCodNom ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private GXBaseCollection<app.SdtSDTProduccionParos>[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P001B2_A396EmprCod ;
   private short[] P001B2_A656ParCod ;
   private boolean[] P001B2_n656ParCod ;
   private String[] P001B2_A602MaqCod ;
   private String[] P001B2_A606MaqDsc ;
   private boolean[] P001B2_n606MaqDsc ;
   private String[] P001B2_A867ParCodNom ;
   private boolean[] P001B2_n867ParCodNom ;
   private java.util.Date[] P001B2_A4440HisProDTI ;
   private boolean[] P001B2_n4440HisProDTI ;
   private java.util.Date[] P001B2_A4441HisProDTF ;
   private boolean[] P001B2_n4441HisProDTF ;
   private java.util.Date[] P001B2_A558HisProFec ;
   private int[] P001B2_A561HisProLin ;
   private GXBaseCollection<app.SdtSDTProduccionParos> Gxm2rootcol ;
   private app.SdtSDTProduccionParos Gxm1sdtproduccionparos ;
}

final  class dpproduccionparos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001B2", "SELECT T1.EmprCod, T1.ParCod, T1.MaqCod, T3.MaqDsc, T2.ParCodNom, T1.HisProDTI, T1.HisProDTF, T1.HisProFec, T1.HisProLin FROM ((TXPLHIPRO T1 LEFT JOIN TXPCODPAR T2 ON T2.EmprCod = T1.EmprCod AND T2.ParCod = T1.ParCod) INNER JOIN TXPMAQUIN T3 ON T3.EmprCod = T1.EmprCod AND T3.MaqCod = T1.MaqCod) WHERE (T1.EmprCod = ? and T1.MaqCod >= ? and T1.ParCod > 0) AND (T1.HisProDTF >= ?) AND (T1.HisProDTF <= ?) AND (T1.MaqCod <= ?) ORDER BY T1.EmprCod, T1.MaqCod, T1.ParCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(8);
               ((int[]) buf[13])[0] = rslt.getInt(9);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setString(5, (String)parms[4], 6);
               return;
      }
   }

}

