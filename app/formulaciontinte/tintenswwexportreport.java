package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tintenswwexportreport", "/app.formulaciontinte.tintenswwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tintenswwexportreport extends GXWebObjectStub
{
   public tintenswwexportreport( )
   {
   }

   public tintenswwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tintenswwexportreport.class ));
   }

   public tintenswwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tintenswwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tintenswwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Intensidades";
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

