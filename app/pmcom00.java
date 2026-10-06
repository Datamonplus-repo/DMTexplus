package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pmcom00", "/app.pmcom00"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pmcom00 extends GXWebObjectStub
{
   public pmcom00( )
   {
   }

   public pmcom00( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pmcom00.class ));
   }

   public pmcom00( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pmcom00_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pmcom00_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Compra";
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

