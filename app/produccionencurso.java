package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccionencurso", "/app.produccionencurso"})
@jakarta.servlet.annotation.MultipartConfig
public final  class produccionencurso extends GXWebObjectStub
{
   public produccionencurso( )
   {
   }

   public produccionencurso( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( produccionencurso.class ));
   }

   public produccionencurso( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new produccionencurso_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new produccionencurso_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Produccion en Curso";
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

