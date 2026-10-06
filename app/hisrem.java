package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.hisrem", "/app.hisrem"})
@jakarta.servlet.annotation.MultipartConfig
public final  class hisrem extends GXWebObjectStub
{
   public hisrem( )
   {
   }

   public hisrem( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( hisrem.class ));
   }

   public hisrem( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new hisrem_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new hisrem_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla HISREM";
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

