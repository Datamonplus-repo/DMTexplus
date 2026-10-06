package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.insertarprocesoenhdr", "/app.insertarprocesoenhdr"})
@jakarta.servlet.annotation.MultipartConfig
public final  class insertarprocesoenhdr extends GXWebObjectStub
{
   public insertarprocesoenhdr( )
   {
   }

   public insertarprocesoenhdr( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( insertarprocesoenhdr.class ));
   }

   public insertarprocesoenhdr( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new insertarprocesoenhdr_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new insertarprocesoenhdr_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Insertar Proceso en Hdr";
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

