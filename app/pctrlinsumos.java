package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pctrlinsumos", "/app.pctrlinsumos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pctrlinsumos extends GXWebObjectStub
{
   public pctrlinsumos( )
   {
   }

   public pctrlinsumos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pctrlinsumos.class ));
   }

   public pctrlinsumos( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pctrlinsumos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pctrlinsumos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ConrolProductosCierre";
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

