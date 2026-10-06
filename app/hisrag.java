package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.hisrag", "/app.hisrag"})
@jakarta.servlet.annotation.MultipartConfig
public final  class hisrag extends GXWebObjectStub
{
   public hisrag( )
   {
   }

   public hisrag( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( hisrag.class ));
   }

   public hisrag( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new hisrag_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new hisrag_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla HISRAG";
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

