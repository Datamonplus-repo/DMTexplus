package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcatdocww", "/app.tcatdocww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcatdocww extends GXWebObjectStub
{
   public tcatdocww( )
   {
   }

   public tcatdocww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcatdocww.class ));
   }

   public tcatdocww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcatdocww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcatdocww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Categorias Documento Transporte";
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

