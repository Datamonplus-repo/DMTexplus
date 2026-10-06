package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.insertarfaseenhdr", "/app.insertarfaseenhdr"})
@jakarta.servlet.annotation.MultipartConfig
public final  class insertarfaseenhdr extends GXWebObjectStub
{
   public insertarfaseenhdr( )
   {
   }

   public insertarfaseenhdr( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( insertarfaseenhdr.class ));
   }

   public insertarfaseenhdr( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new insertarfaseenhdr_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new insertarfaseenhdr_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Insertar Fase en Hdr";
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

