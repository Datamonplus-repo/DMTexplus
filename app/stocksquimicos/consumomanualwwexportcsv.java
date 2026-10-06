package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.consumomanualwwexportcsv", "/app.stocksquimicos.consumomanualwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consumomanualwwexportcsv extends GXWebObjectStub
{
   public consumomanualwwexportcsv( )
   {
   }

   public consumomanualwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consumomanualwwexportcsv.class ));
   }

   public consumomanualwwexportcsv( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consumomanualwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consumomanualwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consumo Manual WWExport CSV";
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

