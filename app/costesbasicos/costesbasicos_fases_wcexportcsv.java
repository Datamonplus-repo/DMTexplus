package app.costesbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.costesbasicos.costesbasicos_fases_wcexportcsv", "/app.costesbasicos.costesbasicos_fases_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class costesbasicos_fases_wcexportcsv extends GXWebObjectStub
{
   public costesbasicos_fases_wcexportcsv( )
   {
   }

   public costesbasicos_fases_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( costesbasicos_fases_wcexportcsv.class ));
   }

   public costesbasicos_fases_wcexportcsv( int remoteHandle ,
                                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new costesbasicos_fases_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new costesbasicos_fases_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Costes Basicos_Fases_WCExport CSV";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

