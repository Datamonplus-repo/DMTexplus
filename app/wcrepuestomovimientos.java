package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcrepuestomovimientos", "/app.wcrepuestomovimientos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcrepuestomovimientos extends GXWebObjectStub
{
   public wcrepuestomovimientos( )
   {
   }

   public wcrepuestomovimientos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcrepuestomovimientos.class ));
   }

   public wcrepuestomovimientos( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcrepuestomovimientos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcrepuestomovimientos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Tabla MRe Mov (Movimientos Repuestos)";
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

