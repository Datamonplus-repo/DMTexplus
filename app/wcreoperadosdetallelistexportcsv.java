package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcreoperadosdetallelistexportcsv", "/app.wcreoperadosdetallelistexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcreoperadosdetallelistexportcsv extends GXWebObjectStub
{
   public wcreoperadosdetallelistexportcsv( )
   {
   }

   public wcreoperadosdetallelistexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcreoperadosdetallelistexportcsv.class ));
   }

   public wcreoperadosdetallelistexportcsv( int remoteHandle ,
                                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcreoperadosdetallelistexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcreoperadosdetallelistexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCReoperados Detalle List Export CSV";
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

