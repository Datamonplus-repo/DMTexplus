package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.recuentoinven_wcexportcsv", "/app.recuentoinven_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recuentoinven_wcexportcsv extends GXWebObjectStub
{
   public recuentoinven_wcexportcsv( )
   {
   }

   public recuentoinven_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recuentoinven_wcexportcsv.class ));
   }

   public recuentoinven_wcexportcsv( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recuentoinven_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recuentoinven_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Recuento Inven_WCExport CSV";
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

