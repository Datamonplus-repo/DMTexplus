package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.formulasequivalentesoduplicacion_wp", "/app.formulaciontinte.formulasequivalentesoduplicacion_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class formulasequivalentesoduplicacion_wp extends GXWebObjectStub
{
   public formulasequivalentesoduplicacion_wp( )
   {
   }

   public formulasequivalentesoduplicacion_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( formulasequivalentesoduplicacion_wp.class ));
   }

   public formulasequivalentesoduplicacion_wp( int remoteHandle ,
                                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new formulasequivalentesoduplicacion_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new formulasequivalentesoduplicacion_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Formulas Equivalentes o Duplicacion";
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

