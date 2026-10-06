package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcatdoc", "/app.tcatdoc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcatdoc extends GXWebObjectStub
{
   public tcatdoc( )
   {
   }

   public tcatdoc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcatdoc.class ));
   }

   public tcatdoc( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcatdoc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcatdoc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Categorias Documento Transporte";
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

